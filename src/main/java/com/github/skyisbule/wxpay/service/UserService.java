package com.github.skyisbule.wxpay.service;

import com.github.skyisbule.wxpay.dao.UserMapper;
import com.github.skyisbule.wxpay.domain.User;
import com.github.skyisbule.wxpay.domain.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper mapper;

    public User getByOpenId(String openId){
        UserExample e = new UserExample();
        e.createCriteria()
                .andOpenIdEqualTo(openId);

        List<User> list =  mapper.selectByExample(e);
        if (list == null || list.size() == 0) return new User();
        return list.get(0);
    }

    public int countUserByOpenId(String openId){
        UserExample e = new UserExample();
        e.createCriteria()
                .andOpenIdEqualTo(openId);
        return (int) mapper.countByExample(e);
    }

    public void insertUser(User user){
        if (user==null || user.getOpenId()==null)
            return;
        user.setOpenUp(0);
        mapper.insert(user);
    }

}
