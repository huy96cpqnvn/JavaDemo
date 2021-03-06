package com.demo.ss3spring.controller;

import com.demo.ss3spring.entity.ProductEntity;
import com.demo.ss3spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {

    @Autowired
    ProductService productService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
//        String message = "Hello Spring Boot + JSP";
//        model.addAttribute("message", message);
        List<ProductEntity> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "index";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam Map<String, String> params) {
        model.addAllAttributes(params);
        return "index";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable int id) {
        ProductEntity product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "detail";

    }
}
