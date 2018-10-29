package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.CollectDAO;
import com.github.skyisbule.wxpay.domain.Collect;
import com.github.skyisbule.wxpay.domain.CollectExample;
import com.github.skyisbule.wxpay.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api("收藏")
@RestController
@RequestMapping(value = "/api/collect",method = {RequestMethod.GET,RequestMethod.POST})
public class CollectController {

    @Autowired
    CollectDAO collectDAO;
    @Autowired
    UserService userService;

    @ApiOperation("添加一条收藏")
    @RequestMapping("/add")
    public String addCollect(Collect collect){
        if (collect.getUid()==null)
            collect.setUid(userService.getByOpenId(collect.getOpenId()).getUid());
        CollectExample e = new CollectExample();
        e.createCriteria()
                .andUidEqualTo(collect.getUid())
                .andShopIdEqualTo(collect.getShopId());
        int count = (int)collectDAO.countByExample(e);
        if (count == 0)
            collectDAO.insert(collect);
        return "success";
    }

    @ApiOperation("获取一个用户收藏的店铺")
    @RequestMapping("/get")
    public List<Map<String,Object>> getByUser(Integer uid){
        return collectDAO.getUserCollected(uid);
    }

}
