package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.WarehouseDao;
import com.github.skyisbule.wxpay.dao.WarehouseMapper;
import com.github.skyisbule.wxpay.dao.WarehouseUnitMapper;
import com.github.skyisbule.wxpay.domain.Warehouse;
import com.github.skyisbule.wxpay.domain.WarehouseExample;
import com.github.skyisbule.wxpay.domain.WarehouseUnit;
import com.github.skyisbule.wxpay.domain.WarehouseUnitExample;
import com.github.skyisbule.wxpay.result.Result;
import com.github.skyisbule.wxpay.vo.WarehouseWithUnitVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Api("关于仓库的api，主要是发布和获取")
@RestController
@RequestMapping(value = "/api/warehouse",method = {RequestMethod.POST,RequestMethod.GET})
public class WarehouseController {

    @Autowired
    WarehouseMapper warehouseMapper;
    @Autowired
    WarehouseUnitMapper warehouseUnitMapper;
    @Autowired
    WarehouseDao warehouseDao;

    @ApiOperation("通过页码获取仓库信息，但不返回里边的存储单元,page从0开始传")
    @RequestMapping("/get-warehouse-simple-by-page")
    public Result getSimpleByPage(@ApiParam("从一开始") int pageNum,
                                  @ApiParam("城市")String city,
                                  @ApiParam("状态为5则为全部") int status,
                                  @ApiParam("一页返回多少数据，不填默认10")Integer pageSize,
                                  @ApiParam("高级搜索的状态")Integer superStatus,
                                  @ApiParam("备注")String remark,
                                  @ApiParam("创建时间")String createDate,
                                  Integer shopId) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date begin = sdf.parse("2018-1-1 00:00:00");
        Date end   = new Date();
        if (createDate!=null){
            if (createDate.length()>6) {
                String[] strs = createDate.split(" - ");
                begin = sdf.parse(strs[0] + " 00:00:00");
                end = sdf.parse(strs[1] + " 00:00:00");
            }
        }
        if (superStatus!=null) status = superStatus;
        if(city==null) city = "";
        if (remark==null) remark = "";
        if(pageSize==null) pageNum = 10;
        WarehouseExample e = new WarehouseExample();
        e.setOffset(10*(pageNum-1));
        e.setLimit(pageSize);
        e.setOrderByClause("wid desc");
        if(status>-1&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status)
                    .andLocateLike("%"+city+"%")
                    .andRemarkLike("%"+remark+"%")
                    .andCreateTimeBetween(begin,end);
        }else {
            e.createCriteria()
                    .andLocateLike("%"+city+"%")
                    .andRemarkLike("%"+remark+"%")
                    .andCreateTimeBetween(begin,end);
        }
        List<Warehouse> list =  warehouseMapper.selectByExample(e);
        HashMap<String,Object> map = new HashMap<>();
        Result result = new Result();
        result.setErrorNo(0);
        map.put("list",list);
        map.put("pageNum",pageNum+1);
        map.put("pageSize",pageSize);
        int total = this.countWarehouse(status,city,shopId);
        map.put("pages",total/pageSize);
        map.put("total",total);
        result.setResults("data",map);
        return result;
    }

    @ApiOperation("通过状态获取有多少仓库，返回整数")
    @RequestMapping("/count-warehouse")
    public Integer countWarehouse(@ApiParam("传5则代表全部") int status,
                                  @ApiParam("城市")String city,
                                  Integer shopId){
        WarehouseExample e = new WarehouseExample();
        if(status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status)
                    .andShopIdEqualTo(shopId)
                    .andLocateLike("%"+city+"%");
        }
        if (status == 5){
            e.createCriteria()
                    .andShopIdEqualTo(shopId)
                    .andLocateLike("%"+city+"%");
        }
        return (int)warehouseMapper.countByExample(e);
    }

    @ApiOperation("通过页码数获取全部的仓库信息信息，包括存储单元")
    @RequestMapping("/get-warehouse-all-by-page")
    public List<WarehouseWithUnitVO> getAllByPage(@ApiParam("从一开始") int pageNum,
                                                  @ApiParam("城市")String city,
                                                  @ApiParam("店铺id")Integer shopId,
                                                  @ApiParam("状态为5则为全部") int status,
                                                  @ApiParam("一页返回多少数据，不填默认10")Integer pageSize,
                                                  @ApiParam("用户的openid")String openId) {
        if(pageSize==null) pageNum = 10;
        WarehouseExample e = new WarehouseExample();
        e.setOffset(10*(pageNum-1));
        e.setLimit(pageSize);
        e.setOrderByClause("wid desc");
        if(status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status)
                    .andLocateLike( "%" + city + "%")
                    .andShopIdEqualTo(shopId)
                    .andOpenIdEqualTo(openId);
        }
        if(status == 5){
            e.createCriteria()
                    .andOpenIdEqualTo(openId)
                    .andShopIdEqualTo(shopId);
        }
        List<Warehouse> warehouses =  warehouseMapper.selectByExample(e);
        List<WarehouseWithUnitVO> results = new ArrayList<>(10);
        for (Warehouse warehouse : warehouses) {
            WarehouseUnitExample ue = new WarehouseUnitExample();
            ue.createCriteria()
                    .andWarehouseIdEqualTo(warehouse.getWid());
            WarehouseWithUnitVO vo = new WarehouseWithUnitVO();
            vo.setWarehouse(warehouse);
            vo.setUnits(warehouseUnitMapper.selectByExample(ue));
            results.add(vo);
        }
        return results;
    }

    @ApiOperation("通过供应Id拿到对应的存储单元")
    @RequestMapping("/get-warehouse-unit")
    public List<WarehouseUnit> getUnits(int warehouseId){
        WarehouseUnitExample e = new WarehouseUnitExample();
        e.createCriteria()
                .andWarehouseIdEqualTo(warehouseId);
        return warehouseUnitMapper.selectByExample(e);
    }

    @ApiOperation("通过仓库id拿到详细信息")
    @RequestMapping("/get-detail-by-wid")
    public WarehouseWithUnitVO getDetail(int wid){
        WarehouseWithUnitVO vo = new WarehouseWithUnitVO();
        vo.setWarehouse(warehouseMapper.selectByPrimaryKey(wid));
        WarehouseUnitExample e = new WarehouseUnitExample();
        e.createCriteria()
                .andWarehouseIdEqualTo(wid);
        vo.setUnits(warehouseUnitMapper.selectByExample(e));
        return vo;
    }

    @ApiOperation("添加一条仓库信息")
    @RequestMapping("add")
    public synchronized String add(@RequestBody WarehouseWithUnitVO vo){
        //todo 这里对数据做一下校验
        String result = "{\"code\":200}";
        vo.getWarehouse().setCreateTime(new Date());
        try {
            warehouseMapper.insert(vo.getWarehouse());
            int warehouseId = warehouseDao.getMaxIdFromWarehouse();
            for (WarehouseUnit unit : vo.getUnits()) {
                unit.setWarehouseId(warehouseId);
                warehouseUnitMapper.insert(unit);
            }
        }catch (Exception e){
           result =  "{\"code\":400}";
        }
        return result;
    }

    @ApiOperation("修改仓库信息")
    @RequestMapping("/update-warehouse")
    public String update(Warehouse warehouse){
        Warehouse old = warehouseMapper.selectByPrimaryKey(warehouse.getWid());
        warehouse.setCreateTime(old.getCreateTime());
        warehouse.setOpenId(old.getOpenId());
        warehouse.setPicture(old.getPicture());
        if (warehouse.getWid()==null) return "null id";
        warehouseMapper.updateByPrimaryKey(warehouse);
        return "{\"errorNo\":\"0\",\"errorInfo\":\"执行成功\",\"results\":{\"data\":[]}}";
    }

    @ApiOperation("控制是否通过")
    @RequestMapping("/pass")
    public String access(int pass,int wid){
        Warehouse warehouse = warehouseMapper.selectByPrimaryKey(wid);
        if (pass == 1)
            warehouse.setStatus(1);
        else
            warehouse.setStatus(2);
        warehouseMapper.updateByPrimaryKey(warehouse);
        return "{\"errorNo\":\"0\",\"errorInfo\":\"执行成功\",\"results\":{\"data\":[]}}";
    }

    @ApiOperation("修改存储单元")
    @RequestMapping("/update-unit")
    public String updateUtil(@RequestBody List<WarehouseUnit> units){
        WarehouseUnitExample e = new WarehouseUnitExample();
        e.createCriteria()
                .andWarehouseIdEqualTo(units.get(0).getWarehouseId());
        warehouseUnitMapper.deleteByExample(e);
        for (WarehouseUnit util : units) {
            warehouseUnitMapper.insert(util);
        }
        return "success";
    }

}
