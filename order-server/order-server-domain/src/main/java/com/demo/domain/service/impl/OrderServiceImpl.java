package com.demo.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.domain.entity.Order;
import com.demo.domain.mapper.IOrderMapper;
import com.demo.domain.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @author yeyu
 * @since 2022-06-17 15:38
 */
@Service
public class OrderServiceImpl extends ServiceImpl<IOrderMapper, Order> implements IOrderService {
}
