package com.example.alibaba.cloudexampleouth2.mapper;

import com.example.alibaba.cloudexampleouth2.entity.TbPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author Liq
 * @since 2020-01-05
 */
public interface TbPermissionMapper extends BaseMapper<TbPermission> {

    /**
     * 查询用户权限
     * @param userId
     * @return
     */
    List<TbPermission> listPermission(@Param("userId") long userId);

}
