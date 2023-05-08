package com.example.demo.entity.product;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ProductSendForm {
    private Long productNum;
    private Long quantity;
    private Boolean isCart;
}
