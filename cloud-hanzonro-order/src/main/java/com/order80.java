package com;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class order80 {
    public static void main(String[] args) {

        //启动类启动之后，从第一行代码SpringApplication开始运行
        SpringApplication.run(order80.class,args);
    }
}
