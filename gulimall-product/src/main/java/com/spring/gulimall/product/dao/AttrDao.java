package com.spring.gulimall.product.dao;

import com.spring.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 20:09:22
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
