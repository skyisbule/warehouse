package com.github.skyisbule.wxpay.dao;

import com.github.skyisbule.wxpay.domain.Warehouse;
import com.github.skyisbule.wxpay.domain.WarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseMapper {
    long countByExample(WarehouseExample example);

    int deleteByExample(WarehouseExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<Warehouse> selectByExample(WarehouseExample example);

    Warehouse selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}