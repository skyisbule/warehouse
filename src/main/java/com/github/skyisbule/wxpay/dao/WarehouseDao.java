package com.github.skyisbule.wxpay.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WarehouseDao {

    @Select("select max(wid) from db_warehouse;")
    public int getMaxIdFromWarehouse();

}
