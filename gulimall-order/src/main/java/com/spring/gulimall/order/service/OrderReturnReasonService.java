package com.spring.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.common.utils.PageUtils;
import com.spring.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 21:57:25
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

