package com.yyh.diary.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * All rights Reserved, Designed By yyh
 * 数据源配置
 * @Package com.yyh.diary.datasource
 * @author: yyh
 * @date: 2019-09-05 17:24
 * @since V1.1.0-SNAPSHOT
 */
@Configuration
public class BeetlSqlDataSourceConfig {

    @Bean(name="datasource")
    public DataSource datasource(Environment env) {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
        ds.setUsername(env.getProperty("spring.datasource.data-username"));
        ds.setPassword(env.getProperty("spring.datasource.data-password"));
        ds.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        return ds;
    }

}
