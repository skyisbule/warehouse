package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.RequireMapper;
import com.github.skyisbule.wxpay.domain.Require;
import com.github.skyisbule.wxpay.domain.RequireExample;
import com.github.skyisbule.wxpay.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@Api("需求相关的api")
@RestController
@RequestMapping(value = "/api/require",method = {RequestMethod.POST,RequestMethod.GET})
public class RequireController {

    @Autowired
    RequireMapper requireMapper;

    @ApiOperation("计算总共有多少需求")
    @RequestMapping("/count-by-status")
    public int countRequire(@ApiParam("5的话则返回全部") int status){
        RequireExample e = new RequireExample();
        if (status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status);
        }
        return (int)requireMapper.countByExample(e);
    }

    @ApiOperation("根据状态和page返回需求")
    @RequestMapping("/get-by-page")
    public Result getByPage(@ApiParam("从一开始") int pageNum,
                            @ApiParam("状态为5则为全部") int status,
                            @ApiParam("一页返回多少数据，不填默认10")Integer pageSize){
        if(pageSize==null) pageNum = 10;
        RequireExample e = new RequireExample();
        e.setOffset(10*(pageNum-1));
        e.setLimit(pageSize);
        e.setOrderByClause("rid desc");
        if (status>0&&status<5){
            e.createCriteria()
                    .andStatusEqualTo(status);
        }
        List<Require> list = requireMapper.selectByExample(e);
        HashMap<String,Object> map = new HashMap<>();
        Result result = new Result();
        result.setErrorNo(0);
        map.put("list",list);
        map.put("pageNum",pageNum+1);
        map.put("pageSize",pageSize);
        int total = this.countRequire(status);
        map.put("pages",total/pageSize);
        map.put("total",total);
        result.setResults("data",map);
        return result;
    }

    @ApiOperation("通过需求id获取需求的完整信息")
    @RequestMapping("/get-by-id")
    public Require getById(int rid){
        return requireMapper.selectByPrimaryKey(rid);
    }

}
