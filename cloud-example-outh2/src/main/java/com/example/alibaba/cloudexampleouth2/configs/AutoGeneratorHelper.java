package com.example.alibaba.cloudexampleouth2.configs;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.ResourceBundle;

/**
 * @author liq
 * @date 2020/1/5
 */
public class AutoGeneratorHelper {

    public static void main(String[] args) {


        ResourceBundle rb = ResourceBundle.getBundle("Mybatis-Plus-Generator");

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        String property = System.getProperty("user.dir");
        globalConfig.setOutputDir(System.getProperty("user.dir") + rb.getString("moduleName") + "/src/main/java");
        System.out.println(System.getProperty("user.dir") + rb.getString("moduleName") + "/src/main/java");
        globalConfig.setAuthor(rb.getString("author"));
        globalConfig.setBaseColumnList(true);
        globalConfig.setBaseResultMap(true);
        globalConfig.setOpen(false);

        // 数据库配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://61.155.157.42:13306/annual_meeting?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername("tmc");
        dataSourceConfig.setPassword("tmc");

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setEntityLombokModel(true);
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setInclude(rb.getString("tableName").split(","));
        strategy.setRestControllerStyle(false);



        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.example.alibaba.cloudexampleouth2");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setXml("mapper");
        pc.setService("service.itf");
        pc.setServiceImpl("service.impl");
        pc.setController(null);

        // 配置生成表
        mpg
                .setPackageInfo(pc)
                .setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategy);
        mpg.execute();


    }
}
