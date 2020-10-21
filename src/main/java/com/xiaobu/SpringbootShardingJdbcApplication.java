package com.xiaobu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author xiaobu
 */
@SpringBootApplication
@EnableConfigurationProperties
public class SpringbootShardingJdbcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardingJdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("服务启动成功......");
    }
}
