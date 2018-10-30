package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.RequireMapper;
import com.github.skyisbule.wxpay.domain.Require;
import com.github.skyisbule.wxpay.domain.RequireExample;
import com.github.skyisbule.wxpay.domain.User;
import com.github.skyisbule.wxpay.result.Result;
import com.github.skyisbule.wxpay.service.UserService;
import com.github.skyisbule.wxpay.vo.RequireWithContactVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Api("需求相关的api")
@RestController
@RequestMapping(value = "/api/require",method = {RequestMethod.POST,RequestMethod.GET})
public class RequireController {

    @Autowired
    RequireMapper requireMapper;
    @Autowired
    UserService userService;

    @ApiOperation("通过订单状态以及城市名称计算总共有多少需求")
    @RequestMapping("/count-by-status")
    public int countRequire(@ApiParam("订单状态，5的话则返回全部") int status,
                            @ApiParam("城市名称")String city,
                            Integer shopId){
        RequireExample e = new RequireExample();
        if (status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status)
                    .andShopIdEqualTo(shopId)
                    .andLocatesLike("%"+city+"%");
        }
        if (status == 5){
            e.createCriteria()
                    .andShopIdEqualTo(shopId)
                    .andLocatesLike("%"+city+"%");
        }
        return (int)requireMapper.countByExample(e);
    }

    @ApiOperation("根据状态页码等参数返回详细的需求数组，注其他4个参数选填，不填则不过滤")
    @RequestMapping("/get-by-page")
    public Result getByPage(@ApiParam("必填：页码号，从1开始") int pageNum,
                            @ApiParam("城市名称")String city,
                            @ApiParam("状态为5则为全部") int status,
                            @ApiParam("一页返回多少数据，不填的话默认为10")Integer pageSize,
                            @ApiParam("用户的openid")String openId,
                            @ApiParam("店铺id")Integer shopId,
                            @ApiParam("创建时间") String createTime,
                            @ApiParam("需求时间")String requireTime,
                            @ApiParam("面积 用-隔开")String areas,
                            @ApiParam("价格 用-隔开")String price,
                            @ApiParam("用途")String purpose,
                            @ApiParam("高级搜索状态")Integer superStatus) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date createTimeBegin  = sdf.parse("2017-11-11 00:00:00");
        Date createTimeEnd    = new Date();
        Date requireTimeBegin = sdf.parse("2017-11-11 00:00:00");
        Date requireTimeEnd   = sdf.parse("2100-11-11 00:00:00");
        if (createTime!=null){
            if(createTime.indexOf("-")>0) {
                String strs[] = createTime.split(" - ");
                createTimeBegin = sdf.parse(strs[0] + " 00:00:00");
                createTimeEnd = sdf.parse(strs[1] + " 00:00:00");
            }
        }
        if (requireTime!=null){
            if(requireTime.length()>6) {
                String strs[] = requireTime.split(" - ");
                requireTimeBegin = sdf.parse(strs[0] + " 00:00:00");
                requireTimeEnd = sdf.parse(strs[1] + " 00:00:00");
            }
        }

        int priceBegin = 0;
        int priceEnd   = 999999999;
        if (price!=null){
            if (price.length()>2) {
                String strs[] = price.split("-");
                priceBegin = Integer.parseInt(strs[0]);
                priceEnd = Integer.parseInt(strs[1]);
            }
        }

        int areaBegin = 0;
        int areaEnd   = 999999999;
        if (areas!=null){
            if (areas.indexOf("-")>1) {
                String strs[] = areas.split("-");
                areaBegin = Integer.parseInt(strs[0]);
                areaEnd = Integer.parseInt(strs[1]);
            }
        }
        if (city==null) city="";
        if (purpose==null) purpose="";
        if (superStatus!=null) status = superStatus;

        if(pageSize==null) pageNum = 10;
        RequireExample e = new RequireExample();
        e.setOffset(10*(pageNum-1));
        e.setLimit(pageSize);
        e.setOrderByClause("rid desc");
        if (status>-1&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status)
                    .andLocatesLike("%"+city+"%")
                    .andShopIdEqualTo(shopId)
                    .andOpenIdEqualTo(openId)
                    .andCreateTimeBetween(createTimeBegin,createTimeEnd)
                    .andRequireTimeBetween(requireTimeBegin,requireTimeEnd)
                    .andAreaBetween(areaBegin,areaEnd)
                    .andMaxPriceBetween(priceBegin,priceEnd)
                    .andPurposeLike("%"+purpose+"%");
        }
        if(status == 5){
            e.createCriteria()
                    .andLocatesLike("%"+city+"%")
                    .andOpenIdEqualTo(openId)
                    .andShopIdEqualTo(shopId)
                    .andCreateTimeBetween(createTimeBegin,createTimeEnd)
                    .andRequireTimeBetween(requireTimeBegin,requireTimeEnd)
                    .andAreaBetween(areaBegin,areaEnd)
                    .andMaxPriceBetween(priceBegin,priceEnd)
                    .andPurposeLike("%"+purpose+"%");
        }
        List<Require> list = requireMapper.selectByExample(e);
        List<RequireWithContactVO> vos = new ArrayList<>();
        //这里获取一下用户信息
        for (Require require : list) {
            RequireWithContactVO vo = new RequireWithContactVO();
            vo.setRequire(require);
            vo.setUser(userService.getByOpenId(require.getOpenId()));
            vos.add(vo);
        }
        HashMap<String,Object> map = new HashMap<>();
        Result result = new Result();
        result.setErrorNo(0);
        map.put("list",vos);
        map.put("pageNum",pageNum+1);
        map.put("pageSize",pageSize);
        int total = this.countRequire(status,city,shopId);
        map.put("pages",total/pageSize);
        map.put("total",total);
        result.setResults("data",map);
        return result;
    }

    @ApiOperation("通过需求的rid获取需求的完整信息")
    @RequestMapping("/get-by-id")
    public Require getById(int rid){
        return requireMapper.selectByPrimaryKey(rid);
    }

    @ApiOperation("修改需求信息")
    @RequestMapping("/update")
    public String update(Require require){
        Require old = requireMapper.selectByPrimaryKey(require.getRid());
        require.setCreateTime(old.getCreateTime());
        require.setOpenId(old.getOpenId());
        requireMapper.updateByPrimaryKey(require);
        return "{\"errorNo\":\"0\",\"errorInfo\":\"执行成功\",\"results\":{\"data\":[]}}";
    }

    @ApiOperation("控制需求是否通过")
    @RequestMapping("/pass")
    public String access(int pass,int rid){
        Require require = requireMapper.selectByPrimaryKey(rid);
        if (pass == 1)
            require.setStatus(1);
        else
            require.setStatus(2);
        requireMapper.updateByPrimaryKey(require);
        return "{\"errorNo\":\"0\",\"errorInfo\":\"执行成功\",\"results\":{\"data\":[]}}";
    }

    @ApiOperation("添加一条需求")
    @RequestMapping("/add")
    public String add(Require require){
        if (require.getSourceRid()==null)
            require.setSourceRid(require.getShopId());
        require.setCreateTime(new Date());
        requireMapper.insert(require);
        return "success";
    }

    @ApiOperation("通过需求id获取发这条信息的用户详情信息")
    @RequestMapping("/get-user-by-rid")
    public User getUserByRid(int rid){
        Require require = new Require();
        require = requireMapper.selectByPrimaryKey(rid);
        return userService.getByOpenId(require.getOpenId());
    }

}
