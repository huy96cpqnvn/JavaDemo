package com.example.springthymeleaf.service;

import com.example.springthymeleaf.entity.BookEntity;

import java.util.List;

public interface BookService {
    BookEntity addBook(BookEntity bookEntity);
    List<BookEntity> getAllBook();
    BookEntity getBookById(int id);
    BookEntity editBook(BookEntity bookEntity);
    void deleteBook(int id);
}
