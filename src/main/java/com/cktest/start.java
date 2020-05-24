package com.cktest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages="com.cktest.mapper")
@EnableSwagger2
@EnableTransactionManagement 
public class start {
    public static void main(String[] args) {
        SpringApplication.run(start.class, args);
    }
}
