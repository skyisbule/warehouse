package com.github.skyisbule.wxpay.dao;

import com.github.skyisbule.wxpay.domain.WarehouseUnit;
import com.github.skyisbule.wxpay.domain.WarehouseUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseUnitMapper {
    long countByExample(WarehouseUnitExample example);

    int deleteByExample(WarehouseUnitExample example);

    int deleteByPrimaryKey(Integer wuid);

    int insert(WarehouseUnit record);

    int insertSelective(WarehouseUnit record);

    List<WarehouseUnit> selectByExample(WarehouseUnitExample example);

    WarehouseUnit selectByPrimaryKey(Integer wuid);

    int updateByExampleSelective(@Param("record") WarehouseUnit record, @Param("example") WarehouseUnitExample example);

    int updateByExample(@Param("record") WarehouseUnit record, @Param("example") WarehouseUnitExample example);

    int updateByPrimaryKeySelective(WarehouseUnit record);

    int updateByPrimaryKey(WarehouseUnit record);
}