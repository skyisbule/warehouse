package com.github.skyisbule.wxpay.service;

import com.github.skyisbule.wxpay.dao.UserMapper;
import com.github.skyisbule.wxpay.domain.User;
import com.github.skyisbule.wxpay.domain.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper mapper;

    public User getByOpenId(String openId){
        UserExample e = new UserExample();
        e.createCriteria()
                .andOpenIdEqualTo(openId);
        return mapper.selectByExample(e).get(0);
    }

}
