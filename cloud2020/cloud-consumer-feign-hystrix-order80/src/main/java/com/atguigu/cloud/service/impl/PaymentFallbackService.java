package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;


@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------------PaymentFallbackService fallback-paymentINFO_ok,[[[[[[";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------------PaymentFallbackService fallback-paymentINFO_TIMEOUT-------,#########";
    }
}
