package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.WarehouseDao;
import com.github.skyisbule.wxpay.dao.WarehouseMapper;
import com.github.skyisbule.wxpay.dao.WarehouseUnitMapper;
import com.github.skyisbule.wxpay.domain.Warehouse;
import com.github.skyisbule.wxpay.domain.WarehouseExample;
import com.github.skyisbule.wxpay.domain.WarehouseUnit;
import com.github.skyisbule.wxpay.domain.WarehouseUnitExample;
import com.github.skyisbule.wxpay.vo.WarehouseWithUnitVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    public List<Warehouse> getSimpleByPage(@ApiParam("从0开始传") int page,
                                           @ApiParam("传5则代表获取全部")
                                                   int status){
        WarehouseExample e = new WarehouseExample();
        e.setOffset(10*page);
        e.setLimit(10);
        if(status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status);
        }
        return warehouseMapper.selectByExample(e);
    }

    @ApiOperation("通过状态获取有多少仓库，返回整数")
    @RequestMapping("/count-warehouse")
    public Integer countWarehouse(@ApiParam("传5则代表全部") int status){
        WarehouseExample e = new WarehouseExample();
        if(status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status);
        }
        return (int)warehouseMapper.countByExample(e);
    }

    @ApiOperation("通过页码数获取全部的仓库信息信息，包括存储单元")
    @RequestMapping("/get-warehouse-all-by-page")
    public List<WarehouseWithUnitVO> getAllByPage(@ApiParam("从0开始传")int page,
                                                  @ApiParam("传5则代表获取全部")
                                                   int status) {
        WarehouseExample e = new WarehouseExample();
        e.setOffset(10*page);
        e.setLimit(10);
        if(status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status);
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

    @ApiOperation("添加一条仓库信息")
    public synchronized String add(WarehouseWithUnitVO vo){
        //todo 这里对数据做一下校验
        String result = "{\"code\":200}";
        try {
            WarehouseExample e = new WarehouseExample();
            warehouseMapper.insert(vo.getWarehouse());
            WarehouseUnitExample ue = new WarehouseUnitExample();
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

}
