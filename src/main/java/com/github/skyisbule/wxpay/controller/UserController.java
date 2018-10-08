package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.AdminMapper;
import com.github.skyisbule.wxpay.dao.UserMapper;
import com.github.skyisbule.wxpay.domain.AdminExample;
import com.github.skyisbule.wxpay.domain.User;
import com.github.skyisbule.wxpay.domain.UserExample;
import com.github.skyisbule.wxpay.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@Api("个人信息")
@Controller
@RequestMapping(value = "/api/user",method = {RequestMethod.POST,RequestMethod.GET})
public class UserController {

    @Autowired
    UserMapper userMapper;
    @Autowired
    AdminMapper adminMapper;

    @ApiOperation("通过用户的openId，获取用户的详细信息")
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

    @ResponseBody
    @RequestMapping("/count-all-user")
    public Integer count(){
        UserExample e = new UserExample();
        e.createCriteria()
                .andOpenIdIsNotNull();
        return (int)userMapper.countByExample(e);
    }

    @RequestMapping("/get-by-page")
    @ResponseBody
    public Result getByPage(@ApiParam("必填：页码号，从1开始") int pageNum,
                                @ApiParam("一页返回多少数据，不填的话默认为10")Integer pageSize){
        UserExample e = new UserExample();
        e.setLimit(pageSize);
        e.setOffset((pageNum-1)*10);
        e.createCriteria()
                .andOpenIdIsNotNull();
        List<User> list =  userMapper.selectByExample(e);
        HashMap<String,Object> map = new HashMap<>();
        Result result = new Result();
        result.setErrorNo(0);
        map.put("list",list);
        map.put("pageNum",pageNum+1);
        map.put("pageSize",pageSize);
        int total = this.count();
        map.put("pages",total/pageSize);
        map.put("total",total);
        result.setResults("data",map);
        return result;
    }

    @RequestMapping("/update")
    @ResponseBody
    public String doUpdate(User user){
        User oldUser = userMapper.selectByPrimaryKey(user.getUid());
        user.setOpenId(oldUser.getOpenId());
        userMapper.updateByPrimaryKey(user);
        return "{\"errorNo\":\"0\",\"errorInfo\":\"执行成功\",\"results\":{\"data\":[]}}";
    }

}
