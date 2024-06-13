package com.esxy.controller;


import com.esxy.pojo.Payment;
import com.esxy.pojo.ResultCommon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")

@Slf4j
public class OrderContrloler {
    public  static  final  String PAYMENT_URL="http://payment-service/payment";

    @Autowired
    private RestTemplate restTemplate;

    //查
    @GetMapping("/payment/selectPaymentAll/{id}")
    public ResultCommon selectPaymentAll(@PathVariable("id")long id){

        return  restTemplate.getForObject(PAYMENT_URL+"/selectPaymentAll/"+id,ResultCommon.class);
    }
    //增
    @PostMapping ("/payment/addPayment")
    public ResultCommon addPayment(  Payment payment){
        return  restTemplate.postForObject(PAYMENT_URL+"/addPayment/",payment, ResultCommon.class);
    }

    //删
    @GetMapping("/payment/removePayment/{id}")
    public ResultCommon removePayment(@PathVariable("id") Long id){
        return  restTemplate.getForObject(PAYMENT_URL+"/removePayment/"+id,ResultCommon.class);
    }

    //改
    @PostMapping("/payment/updatePayment")
    public ResultCommon updatePayment( Payment payment){

        return  restTemplate.postForObject(PAYMENT_URL+"/updatePayment/",payment, ResultCommon.class);

    }



}
