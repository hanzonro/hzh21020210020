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
    //查
    @GetMapping("/selectPaymentAll/{id}")
    public ResultCommon selectPaymentAll(@PathVariable("id") Long id) {
        List<Payment> payments = paymentService.selectPaymentAll(id);

        return new ResultCommon(UtilFinal.SUCCESS_CODE,UtilFinal.SUCCESS_MSG+"8002",payments);
    }

    //增

    @PostMapping("/addPayment")
    public ResultCommon addPayment(@RequestBody Payment payment) {
        int i = paymentService.addPayment(payment);

        if (i>0){
            return new ResultCommon(UtilFinal.SUCCESS_CODE,"新增成功8002");
        }else {
            return new ResultCommon(UtilFinal.FAIL_CODE,UtilFinal.FAIL_MSG);
        }
    }

    //删
    @GetMapping("/removePayment/{id}")
    public ResultCommon removePayment(@PathVariable("id") Long id){
        int i=paymentService.removePayment(id);
        if (i>0){
            return new ResultCommon(UtilFinal.SUCCESS_CODE,"删除成功8002");
        }else {
            return new ResultCommon(UtilFinal.FAIL_CODE,UtilFinal.FAIL_MSG);
        }
    }


    //改
    @PostMapping("/updatePayment")
    public ResultCommon updatePayment(@RequestBody Payment payment){
        int i = paymentService.updatePayment(payment);
        if (i>0){
            return new ResultCommon(UtilFinal.SUCCESS_CODE,"修改成功8002");
        }else {
            return new ResultCommon(UtilFinal.FAIL_CODE,UtilFinal.FAIL_MSG);
        }
    }




}
