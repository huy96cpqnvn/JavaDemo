package com.demo.ss3spring.service;

import com.demo.ss3spring.entity.ProductEntity;
import com.demo.ss3spring.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;
    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity getProductById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<ProductEntity> getProductByNameCustom(String name) {
        return productRepo.findProductByNameCustom(name);
    }

    @Override
    public ProductEntity createProduct(ProductEntity p) {
        return productRepo.save(p);
    }
}
