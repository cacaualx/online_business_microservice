package com.productmicroservice.Product_MS.repository;

import com.productmicroservice.Product_MS.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
