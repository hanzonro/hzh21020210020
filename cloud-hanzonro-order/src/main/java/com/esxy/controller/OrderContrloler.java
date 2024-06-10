package com.esxy.controller;


import com.esxy.pojo.ResultCommon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")

@Slf4j
public class OrderContrloler {

    public  static  final  String PAYMENT_URL="http://localhost:8001/payment";

//    public  static  final  String PAYMENT_URL="http://PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/payment/selectPaymentAll/{id}")
    public ResultCommon selectPaymentAll(@PathVariable("id")long id){
        System.out.println("12312");
        return  restTemplate.getForObject(PAYMENT_URL+"/selectPaymentAll/"+id,ResultCommon.class);
    }

}
