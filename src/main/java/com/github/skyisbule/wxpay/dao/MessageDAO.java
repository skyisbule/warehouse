package com.github.skyisbule.wxpay.dao;

import com.github.skyisbule.wxpay.dao.MyBatisBaseDao;
import com.github.skyisbule.wxpay.domain.Message;
import com.github.skyisbule.wxpay.domain.MessageExample;
import org.springframework.stereotype.Repository;

/**
 * MessageDAO继承基类
 */
@Repository
public interface MessageDAO extends MyBatisBaseDao<Message, Integer, MessageExample> {
}