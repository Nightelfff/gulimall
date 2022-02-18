package com.spring.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.common.utils.PageUtils;
import com.spring.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lxl
 * @email lxl@gmail.com
 * @date 2022-02-18 21:47:37
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

