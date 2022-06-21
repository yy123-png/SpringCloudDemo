package com.yy.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.dao.entity.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yeyu
 * @since 2022-06-21 16:46
 */
@Mapper
public interface IStockMapper extends BaseMapper<Stock> {
    boolean reduceStock(@Param("skuId") Long skuId, @Param("quantity") Integer quantity);
}
