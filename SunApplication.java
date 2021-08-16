package com.sun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.sun.dao")
@SpringBootApplication
public class SunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunApplication.class, args);
    }

}
