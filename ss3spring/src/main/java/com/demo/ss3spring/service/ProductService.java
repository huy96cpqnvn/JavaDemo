package com.demo.ss3spring.service;

import com.demo.ss3spring.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProduct();
    ProductEntity getProductById(int id);
    List<ProductEntity> getProductByNameCustom(String name);
    ProductEntity createProduct(ProductEntity p);
}
