package com.esxy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class haneureka {
    public static void main(String[] args) {
        SpringApplication.run(haneureka.class,args);
    }
}
