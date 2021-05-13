package com.example.springthymeleaf.repository;

import com.example.springthymeleaf.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookEntity, Integer> {
}
