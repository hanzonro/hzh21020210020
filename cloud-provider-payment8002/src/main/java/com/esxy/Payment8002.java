package com.esxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication//标记此时此刻当前类为启动类
@MapperScan("com.esxy.mapper")
@EnableEurekaClient
public class Payment8002 {
    public static void main(String[] args) {

        //启动类启动之后，从第一行代码SpringApplication开始运行
        SpringApplication.run(Payment8002.class,args);
    }
}
