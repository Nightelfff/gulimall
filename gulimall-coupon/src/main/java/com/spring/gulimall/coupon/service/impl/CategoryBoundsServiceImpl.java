package com.spring.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.common.utils.PageUtils;
import com.spring.common.utils.Query;

import com.spring.gulimall.coupon.dao.CategoryBoundsDao;
import com.spring.gulimall.coupon.entity.CategoryBoundsEntity;
import com.spring.gulimall.coupon.service.CategoryBoundsService;


@Service("categoryBoundsService")
public class CategoryBoundsServiceImpl extends ServiceImpl<CategoryBoundsDao, CategoryBoundsEntity> implements CategoryBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryBoundsEntity> page = this.page(
                new Query<CategoryBoundsEntity>().getPage(params),
                new QueryWrapper<CategoryBoundsEntity>()
        );

        return new PageUtils(page);
    }

}