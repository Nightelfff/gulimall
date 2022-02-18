package com.spring.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.common.utils.PageUtils;
import com.spring.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 22:05:18
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

