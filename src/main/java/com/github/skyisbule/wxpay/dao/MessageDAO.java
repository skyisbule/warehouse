package com.github.skyisbule.wxpay.dao;

import com.github.skyisbule.wxpay.domain.Message;
import com.github.skyisbule.wxpay.domain.MessageExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * MessageDAO继承基类
 */
@Repository
public interface MessageDAO extends MyBatisBaseDao<Message, Integer, MessageExample> {

    @Select("select * from db_message where open_id = #{openId} or open_id is null and locate like #{locate} or locate is null"+
            " order by mid desc limit ${page},10")
    public List<Map<String,Object>> getByUserAndPage(@Param("openId")String  openId,
                                      @Param("locate")String  locate,
                                      @Param("page")  Integer page);
}