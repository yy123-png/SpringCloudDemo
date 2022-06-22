package com.yy.dao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yy.dao.entity.OrderDetail;
import com.yy.dao.mapper.IOrderDetailMapper;
import com.yy.dao.service.IOrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @author yeyu
 * @since 2022-06-22 11:26
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<IOrderDetailMapper, OrderDetail> implements IOrderDetailService {
}
