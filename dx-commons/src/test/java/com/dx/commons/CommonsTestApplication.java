package com.dx.commons;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.dx.commons"})
public class CommonsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonsTestApplication.class, args);
    }

}
