package com.example.demo.api.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
public class ProductSelectDto {
    private Long productNum;
    private String productTitle;
    private int productPrice;
    private String productImg;
    private int productStock;

    public ProductSelectDto(Long productNum, String productTitle, int productPrice, String productImg, int productStock) {
        this.productNum = productNum;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
        this.productImg = productImg;
        this.productStock = productStock;
    }
}
