package com.example.demo.api.apiService;

import com.example.demo.api.dto.Result;
import com.example.demo.api.dto.member.MemberSelectResponse;
import com.example.demo.api.dto.product.ProductSelectDto;
import com.example.demo.entity.member.Member;
import com.example.demo.entity.product.Product;
import com.example.demo.service.interfaces.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Component
@Slf4j
public class ProductApiService {
    private final ProductService productService;

    public Page<ProductSelectDto> findAll(Pageable pageable){
        Page<Product> all = productService.findAll(pageable);
        List<ProductSelectDto> collect = all.stream()
                .map(m -> new ProductSelectDto(m.getProductNum(),
                        m.getProductTitle(),
                        m.getProductPrice(),
                        m.getProductImg(),
                        m.getProductStock()))
                .collect(Collectors.toList());
        return new PageImpl<>(collect,pageable, all.getTotalElements());
    }
}
