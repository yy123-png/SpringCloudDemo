package com.yy.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.dao.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yeyu
 * @since 2022-06-22 11:24
 */
@Mapper
public interface IOrderDetailMapper extends BaseMapper<OrderDetail> {
}
