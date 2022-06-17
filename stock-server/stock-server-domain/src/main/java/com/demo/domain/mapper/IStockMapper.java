package com.demo.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.domain.entity.Stock;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yeyu
 * @since 2022-06-17 17:46
 */
@Mapper
public interface IStockMapper extends BaseMapper<Stock> {
}
