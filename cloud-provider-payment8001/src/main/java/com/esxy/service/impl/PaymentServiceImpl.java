package com.esxy.service.impl;

import com.esxy.mapper.PaymentMapper;
import com.esxy.pojo.Payment;
import com.esxy.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired(required = false)
    private PaymentMapper paymentMapper;
    @Override
    public List<Payment> selectPaymentAll(Long id) {
        return paymentMapper.selectPaymentAll(id);
    }
    @Override
    public int addPayment(Payment payment) {
        return paymentMapper.addPayment(payment);
    }
    @Override
    public int removePayment(Long id) {
        return paymentMapper.removePayment(id);
    }
    @Override
    public int updatePayment(Payment payment) {
        return paymentMapper.updatePayment(payment);
    }


}
