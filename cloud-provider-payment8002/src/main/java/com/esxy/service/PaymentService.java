package com.esxy.service;

import com.esxy.pojo.Payment;

import java.util.List;

public interface PaymentService {

    public List<Payment> selectPaymentAll(Long id);

    public int addPayment(Payment payment);

    public int removePayment(Long id);

    public int updatePayment(Payment payment);
}
