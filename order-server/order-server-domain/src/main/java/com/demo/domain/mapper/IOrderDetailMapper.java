package com.demo.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.domain.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yeyu
 * @since 2022-06-17 14:38
 */
@Mapper
public interface IOrderDetailMapper extends BaseMapper<OrderDetail> {
}
