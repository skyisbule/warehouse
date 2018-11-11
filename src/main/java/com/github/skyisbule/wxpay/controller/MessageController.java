package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.MessageDAO;
import com.github.skyisbule.wxpay.domain.Message;
import com.github.skyisbule.wxpay.domain.User;
import com.github.skyisbule.wxpay.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    MessageDAO messageDAO;
    @Autowired
    UserService userService;

    @ApiOperation("通过用户信息返回这个用户应该接收到的消息")
    @RequestMapping("/get-by-user")
    public List<Message> getByUser(String openId,int page){
        User user = userService.getByOpenId(openId);
        return messageDAO.getByUserAndPage(openId,user.getLocate(),(page-1)*10);
    }

    @ApiOperation("添加消息")
    @RequestMapping("/add")
    public String add(Message message){
        messageDAO.insert(message);
        return "success";
    }

}
