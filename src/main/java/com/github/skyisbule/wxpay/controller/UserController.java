package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.AdminMapper;
import com.github.skyisbule.wxpay.dao.UserMapper;
import com.github.skyisbule.wxpay.domain.AdminExample;
import com.github.skyisbule.wxpay.domain.User;
import com.github.skyisbule.wxpay.domain.UserExample;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Api("个人信息")
@Controller
@RequestMapping(value = "/api/user",method = {RequestMethod.POST,RequestMethod.GET})
public class UserController {

    @Autowired
    UserMapper userMapper;
    @Autowired
    AdminMapper adminMapper;

    @ResponseBody
    @RequestMapping("/get-by-id")
    public User getById(String openId){
        UserExample e = new UserExample();
        e.createCriteria()
                .andOpenIdEqualTo(openId);
        return userMapper.selectByExample(e).get(0);
    }

    @RequestMapping("/login")
    public String login(String account, String passwd, HttpServletResponse response){
        AdminExample e = new AdminExample();
        e.createCriteria()
                .andAccountEqualTo(account)
                .andPasswdEqualTo(passwd);
        int count = (int)adminMapper.countByExample(e);
        if (count==1){
            Cookie cookie = new Cookie("id","1");
            response.addCookie(cookie);
            return "redirect:/index";
        }
        return "redirect:/login";

    }

}
