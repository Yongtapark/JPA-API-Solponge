package com.example.demo.repository.product;

import com.example.demo.entity.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{
    Page<Product> findAllByIsDeletedFalse(Pageable Pageable);
}
