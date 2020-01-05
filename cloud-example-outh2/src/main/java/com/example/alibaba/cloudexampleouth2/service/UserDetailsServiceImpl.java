package com.example.alibaba.cloudexampleouth2.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.alibaba.cloudexampleouth2.entity.TbPermission;
import com.example.alibaba.cloudexampleouth2.entity.TbUser;
import com.example.alibaba.cloudexampleouth2.service.itf.ITbPermissionService;
import com.example.alibaba.cloudexampleouth2.service.itf.ITbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

/**
 * @author liq
 * @date 2020/1/5
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    ITbUserService userService;


    @Autowired
    ITbPermissionService permissionService;



    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        TbUser tbUser = userService.getOne(new QueryWrapper<TbUser>().eq("username", name));

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if(tbUser != null) {
            List<TbPermission> tbPermissions = permissionService.listPermission(tbUser.getId());
            // 声明用户授权
            tbPermissions.forEach(tbPermission -> {
                if (tbPermission != null && tbPermission.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });

        }

        return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);

    }

}
