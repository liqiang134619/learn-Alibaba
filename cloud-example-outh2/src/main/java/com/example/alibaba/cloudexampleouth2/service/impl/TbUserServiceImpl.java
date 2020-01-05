package com.example.alibaba.cloudexampleouth2.service.impl;

import com.example.alibaba.cloudexampleouth2.entity.TbUser;
import com.example.alibaba.cloudexampleouth2.mapper.TbUserMapper;
import com.example.alibaba.cloudexampleouth2.service.itf.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Liq
 * @since 2020-01-05
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
