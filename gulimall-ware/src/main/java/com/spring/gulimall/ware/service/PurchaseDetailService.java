package com.spring.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.common.utils.PageUtils;
import com.spring.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 22:05:18
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

