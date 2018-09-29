package com.github.skyisbule.wxpay.dao;

import com.github.skyisbule.wxpay.domain.Require;
import com.github.skyisbule.wxpay.domain.RequireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequireMapper {
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