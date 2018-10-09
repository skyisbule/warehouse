package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.RequireMapper;
import com.github.skyisbule.wxpay.domain.Require;
import com.github.skyisbule.wxpay.domain.RequireExample;
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

import java.util.ArrayList;
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
                            @ApiParam("城市名称")String city){
        RequireExample e = new RequireExample();
        if (status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status)
                    .andLocatesLike(city);
        }
        return (int)requireMapper.countByExample(e);
    }

    @ApiOperation("根据状态页码等参数返回详细的需求数组，注其他4个参数选填，不填则不过滤")
    @RequestMapping("/get-by-page")
    public Result getByPage(@ApiParam("必填：页码号，从1开始") int pageNum,
                            @ApiParam("城市名称")String city,
                            @ApiParam("状态为5则为全部") int status,
                            @ApiParam("一页返回多少数据，不填的话默认为10")Integer pageSize,
                            @ApiParam("用户的openid")String openId){
        if(pageSize==null) pageNum = 10;
        RequireExample e = new RequireExample();
        e.setOffset(10*(pageNum-1));
        e.setLimit(pageSize);
        e.setOrderByClause("rid desc");
        if (status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status)
                    .andLocatesLike(city)
                    .andOpenIdEqualTo(openId);
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
        int total = this.countRequire(status,city);
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
        requireMapper.insert(require);
        return "success";
    }

}
