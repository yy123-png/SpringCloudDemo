package com.yy.dao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yy.dao.entity.OrderInfo;
import com.yy.dao.mapper.IOrderInfoMapper;
import com.yy.dao.service.IOrderInfoService;
import org.springframework.stereotype.Service;

/**
 * @author yeyu
 * @since 2022-06-22 11:26
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<IOrderInfoMapper, OrderInfo> implements IOrderInfoService {
}
