package com.example.demo.api.controller;

import com.example.demo.api.apiService.ProductApiService;
import com.example.demo.api.dto.Result;
import com.example.demo.api.dto.product.ProductSelectDto;
import com.example.demo.service.interfaces.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api.com.solponge/products")
@RequiredArgsConstructor
public class ProductApiController {
    private final ProductApiService productApiService;

    @GetMapping
    ResponseEntity<Page<ProductSelectDto>> selectPage(Pageable pageable){
        return ResponseEntity.ok(productApiService.findAll(pageable));
    }


}
