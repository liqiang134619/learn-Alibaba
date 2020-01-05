package com.example.alibaba.cloudexampleouth2.service.impl;

import com.example.alibaba.cloudexampleouth2.entity.TbPermission;
import com.example.alibaba.cloudexampleouth2.mapper.TbPermissionMapper;
import com.example.alibaba.cloudexampleouth2.service.itf.ITbPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author Liq
 * @since 2020-01-05
 */
@Service
public class TbPermissionServiceImpl extends ServiceImpl<TbPermissionMapper, TbPermission> implements ITbPermissionService {

    @Resource
    TbPermissionMapper permissionMapper;

    @Override
    public List<TbPermission> listPermission(long userId) {
        return permissionMapper.listPermission(userId);
    }
}
