package com.spring.gulimall.product.dao;

import com.spring.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 20:09:22
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
