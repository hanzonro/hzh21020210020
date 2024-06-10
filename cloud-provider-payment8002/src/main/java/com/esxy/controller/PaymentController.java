package com.esxy.controller;

import com.esxy.pojo.Payment;
import com.esxy.pojo.ResultCommon;
import com.esxy.pojo.UtilFinal;
import com.esxy.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/payment")
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    //controller调service层，service调mapper层
    //mapper层写sql语句

    /**
     *
     * @param id  条件查询，从路径上获取id参数,但是从路径上获取的别名只限于getmapper请求方式
     * @return
     */
    @GetMapping("/selectPaymentAll/{id}")
    public ResultCommon selectPaymentAll(@PathVariable("id") Long id) {
        List<Payment> payments = paymentService.selectPaymentAll(id);
        return new ResultCommon(UtilFinal.SUCCESS_CODE,UtilFinal.SUCCESS_MSG,payments);
    }

    @PostMapping("/addPayment")
    public ResultCommon addPayment(Payment payment) {
        int i = paymentService.addPayment(payment);

        if (i>0){
            return new ResultCommon(UtilFinal.SUCCESS_CODE,"新增成功");
        }else {
            return new ResultCommon(UtilFinal.FAIL_CODE,UtilFinal.FAIL_MSG);
        }
    }
}
