package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yeyu
 * @since 2022-06-17 17:49
 */
@SpringBootApplication(scanBasePackages = "com.demo")
@MapperScan(basePackages = "com.demo.domain.mapper")
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class,args);
    }
}
