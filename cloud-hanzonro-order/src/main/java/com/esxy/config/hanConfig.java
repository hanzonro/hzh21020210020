package com.esxy.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class hanConfig {
    @Bean
    public RestTemplate getRestTmplate(){
        return  new RestTemplate();
    }

}
