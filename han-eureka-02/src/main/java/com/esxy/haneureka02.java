package com.esxy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class haneureka02 {
    public static void main(String[] args) {
        SpringApplication.run(haneureka02.class,args);
    }
}
