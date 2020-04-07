package com.sg.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author sg
 * @Date 2020/4/7 17:26
 */

/**
 * Mybatis配置类
 * 扫描生成的mapper接口
 */
@Configuration
@MapperScan("com.sg.mapper")
public class MybatisConfig {
}
