package com.esxy.config;



import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class hanConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTmplate(){
        return  new RestTemplate();
    }

}
