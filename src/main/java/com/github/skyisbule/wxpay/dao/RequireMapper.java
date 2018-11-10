package com.github.skyisbule.wxpay.dao;

import com.github.skyisbule.wxpay.domain.Require;
import com.github.skyisbule.wxpay.domain.RequireExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface RequireMapper {

    @Update("update db_require set shop_id = ${target} where shop_id = ${source}")
    int doChangeShopId(@Param("source")int source,@Param("target")int target);

    long countByExample(RequireExample example);

    int deleteByExample(RequireExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Require record);

    int insertSelective(Require record);

    List<Require> selectByExample(RequireExample example);

    Require selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Require record, @Param("example") RequireExample example);

    int updateByExample(@Param("record") Require record, @Param("example") RequireExample example);

    int updateByPrimaryKeySelective(Require record);

    int updateByPrimaryKey(Require record);
}