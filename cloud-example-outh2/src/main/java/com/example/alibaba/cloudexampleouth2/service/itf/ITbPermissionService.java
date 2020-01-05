package com.example.alibaba.cloudexampleouth2.service.itf;

import com.example.alibaba.cloudexampleouth2.entity.TbPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author Liq
 * @since 2020-01-05
 */
public interface ITbPermissionService extends IService<TbPermission> {

    List<TbPermission> listPermission(long userId);

}
