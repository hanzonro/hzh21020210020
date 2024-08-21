package com.esxy.mapper;

import com.esxy.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaymentMapper {

    //增
    public int addPayment(Payment payment);
    //删
    public int removePayment( @Param("id") Long id);
    //改
    public int updatePayment(Payment payment);

    //查
    public List<Payment> selectPaymentAll(@Param("id") Long id);


}
