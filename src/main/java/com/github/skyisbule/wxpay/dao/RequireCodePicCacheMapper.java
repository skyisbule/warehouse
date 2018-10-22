package com.github.skyisbule.wxpay.dao;

import com.github.skyisbule.wxpay.domain.RequireCodePicCache;
import com.github.skyisbule.wxpay.domain.RequireCodePicCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequireCodePicCacheMapper {
    long countByExample(RequireCodePicCacheExample example);

    int deleteByExample(RequireCodePicCacheExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(RequireCodePicCache record);

    int insertSelective(RequireCodePicCache record);

    List<RequireCodePicCache> selectByExample(RequireCodePicCacheExample example);

    RequireCodePicCache selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") RequireCodePicCache record, @Param("example") RequireCodePicCacheExample example);

    int updateByExample(@Param("record") RequireCodePicCache record, @Param("example") RequireCodePicCacheExample example);

    int updateByPrimaryKeySelective(RequireCodePicCache record);

    int updateByPrimaryKey(RequireCodePicCache record);
}