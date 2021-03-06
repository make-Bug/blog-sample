package com.github.jitwxs.sample.alipay.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author jitwxs
 * @date 2018/3/19 13:24
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.github.jitwxs.sample.alipay.mapper*")
public class MyBatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
