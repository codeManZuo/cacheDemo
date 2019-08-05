package com.zuo.cache.cachedemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

/**
 * @author codeManZuo
 * @date 2019/7/29 0029 - 21:01
 */
@Configuration
public class MyConfig  {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource()
    {
        return new DruidDataSource();
    }
}
