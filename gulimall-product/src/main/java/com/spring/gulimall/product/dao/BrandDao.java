package com.spring.gulimall.product.dao;

import com.spring.gulimall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 20:09:22
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
