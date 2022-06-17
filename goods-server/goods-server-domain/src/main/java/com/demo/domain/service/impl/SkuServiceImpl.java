package com.demo.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.domain.service.ISkuService;
import com.demo.domain.entity.Sku;
import com.demo.domain.mapper.ISkuMapper;
import org.springframework.stereotype.Service;

/**
 * @author yeyu
 * @since 2022-06-17 15:38
 */
@Service
public class SkuServiceImpl extends ServiceImpl<ISkuMapper, Sku> implements ISkuService {
}
