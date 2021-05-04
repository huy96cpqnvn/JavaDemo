package com.demo.ss3spring.controller;

import com.demo.ss3spring.entity.ProductEntity;
import com.demo.ss3spring.model.BaseResponse;
import com.demo.ss3spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public BaseResponse getProduct(@RequestParam Map<String, String> params) {
        BaseResponse res = new BaseResponse();
        String name = params.get("name");
        String id = params.get("id");
        if (name != null) {
            res.data = productService.getProductByNameCustom(name);
        } else if (id != null) {
            res.data = productService.getProductById(Integer.parseInt(id));
        } else {
            res.data = productService.getAllProduct();
        }
        return res;
    }

    @PostMapping
    public BaseResponse createProduct(@RequestBody ProductEntity p) {
        BaseResponse res = new BaseResponse();
        res.data = productService.createProduct(p);
        return res;
    }
}
