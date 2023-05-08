package com.example.demo.entity.payment;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class PaymentOrderNum {

    private Map<Long,List<Payment>> payments;


    public PaymentOrderNum(Map<Long, List<Payment>> payments) {
        this.payments = payments;
    }
}
