package com.yy.biz.impl.utils;

import com.yy.dao.entity.Sku;
import com.yy.dto.SkuDTO;
import org.springframework.beans.BeanUtils;

/**
 * @author yeyu
 * @since 2022-06-22 10:57
 */
public class DtoBuilder {
    public static SkuDTO build(Sku sku) {
        SkuDTO skuDTO = new SkuDTO();
        BeanUtils.copyProperties(sku,skuDTO);
        return skuDTO;
    }
}
