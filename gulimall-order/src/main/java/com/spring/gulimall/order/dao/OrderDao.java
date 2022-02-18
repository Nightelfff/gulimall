package com.spring.gulimall.order.dao;

import com.spring.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 21:57:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
