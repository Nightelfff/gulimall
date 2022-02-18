package com.spring.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.common.utils.PageUtils;
import com.spring.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 20:09:22
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

