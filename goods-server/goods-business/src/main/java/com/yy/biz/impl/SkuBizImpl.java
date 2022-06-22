package com.yy.biz.impl;

import com.yy.biz.ISkuBiz;
import com.yy.biz.impl.utils.DtoBuilder;
import com.yy.dao.entity.Sku;
import com.yy.dao.service.ISkuService;
import com.yy.dto.SkuDTO;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-22 10:44
 */
@Service
public class SkuBizImpl implements ISkuBiz {

    @Resource
    private ISkuService skuService;

    @Override
    public SkuDTO querySku(Long skuId) {
        Sku sku = skuService.getById(skuId);
        if (ObjectUtils.isEmpty(sku)) {
            throw new RuntimeException("商品不存在!");
        }
        return DtoBuilder.build(sku);
    }




}
