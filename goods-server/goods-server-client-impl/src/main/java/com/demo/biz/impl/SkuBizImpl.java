package com.demo.biz.impl;

import com.demo.biz.ISkuBiz;
import com.demo.dto.SkuDTO;
import com.demo.domain.entity.Sku;
import com.demo.domain.service.ISkuService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-17 16:21
 */
@Service
public class SkuBizImpl implements ISkuBiz {

    @Resource
    private ISkuService skuService;

    @Override
    public SkuDTO querySku(Long skuId) {
        Sku sku = skuService.getById(skuId);

        SkuDTO skuDTO = new SkuDTO();
        BeanUtils.copyProperties(sku,skuDTO);
        return skuDTO;
    }
}
