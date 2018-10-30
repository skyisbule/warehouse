package com.github.skyisbule.wxpay.dao;

import com.github.skyisbule.wxpay.domain.Collect;
import com.github.skyisbule.wxpay.domain.CollectExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * CollectDAO继承基类
 */
@Repository
public interface CollectDAO extends MyBatisBaseDao<Collect, Integer, CollectExample> {

    @Select("select * from db_collect c left join db_user u on c.shop_id = u.uid where c.uid = ${uid} ")
    public List<Map<String,Object>> getUserCollected(@Param("uid") int uid);

}