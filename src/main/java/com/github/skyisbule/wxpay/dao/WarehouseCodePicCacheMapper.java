package com.github.skyisbule.wxpay.dao;

import com.github.skyisbule.wxpay.domain.WarehouseCodePicCache;
import com.github.skyisbule.wxpay.domain.WarehouseCodePicCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseCodePicCacheMapper {
    long countByExample(WarehouseCodePicCacheExample example);

    int deleteByExample(WarehouseCodePicCacheExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(WarehouseCodePicCache record);

    int insertSelective(WarehouseCodePicCache record);

    List<WarehouseCodePicCache> selectByExample(WarehouseCodePicCacheExample example);

    WarehouseCodePicCache selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") WarehouseCodePicCache record, @Param("example") WarehouseCodePicCacheExample example);

    int updateByExample(@Param("record") WarehouseCodePicCache record, @Param("example") WarehouseCodePicCacheExample example);

    int updateByPrimaryKeySelective(WarehouseCodePicCache record);

    int updateByPrimaryKey(WarehouseCodePicCache record);
}