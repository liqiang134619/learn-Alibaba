package com.example.alibaba.cloudexampleouth2;

import com.example.alibaba.cloudexampleouth2.entity.TbPermission;
import com.example.alibaba.cloudexampleouth2.service.itf.ITbPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author liq
 * @date 2020/1/5
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    ITbPermissionService permissionService;




    @Test
    public void test() {

        List<TbPermission> tbPermissions = permissionService.listPermission(37);
        System.out.println(tbPermissions);

    }
}
