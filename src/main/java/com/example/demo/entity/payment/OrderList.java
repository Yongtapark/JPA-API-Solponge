package com.example.demo.entity.payment;

import lombok.Data;

@Data
public class OrderList {
    Long cartItemNum;
    Long productNum;
    Long productPrice;
    Long paymentStock;
}
