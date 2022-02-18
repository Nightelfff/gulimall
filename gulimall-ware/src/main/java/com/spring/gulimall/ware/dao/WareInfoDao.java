package com.spring.gulimall.ware.dao;

import com.spring.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 22:05:18
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
