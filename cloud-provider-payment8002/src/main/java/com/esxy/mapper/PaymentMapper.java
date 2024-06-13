package com.esxy.mapper;

import com.esxy.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaymentMapper {



//     @Param("id")  别名
//      @param id  参数名   一般来说，别名和参数名保持一致，如果出现不一致的情况，使用的是  别名
//     @return




    //一功能，一接口，一方法
    //增
    public int addPayment(Payment payment);
    //删
    public int removePayment(@Param("id") Long id);
    //改
    public int updatePayment(Payment payment);

    //查
    public List<Payment> selectPaymentAll(@Param("id") Long id);


}
