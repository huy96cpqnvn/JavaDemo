package com.example.springthymeleaf.service;

import com.example.springthymeleaf.entity.CategoryEntity;
import com.example.springthymeleaf.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<CategoryEntity> getAllCategory() {
        return categoryRepo.findAll();
    }
}
