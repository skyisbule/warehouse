package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.UserMapper;
import com.github.skyisbule.wxpay.domain.User;
import com.github.skyisbule.wxpay.domain.UserExample;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("个人信息")
@RestController
@RequestMapping(value = "/api/user",method = {RequestMethod.POST,RequestMethod.GET})
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/get-by-id")
    public User getById(String openId){
        UserExample e = new UserExample();
        e.createCriteria()
                .andOpenIdEqualTo(openId);
        return userMapper.selectByExample(e).get(0);
    }

}
