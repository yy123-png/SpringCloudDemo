package com.demo.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.domain.entity.OrderDetail;
import com.demo.domain.mapper.IOrderDetailMapper;
import com.demo.domain.service.IOrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @author yeyu
 * @since 2022-06-17 15:38
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<IOrderDetailMapper, OrderDetail> implements IOrderDetailService {
}
