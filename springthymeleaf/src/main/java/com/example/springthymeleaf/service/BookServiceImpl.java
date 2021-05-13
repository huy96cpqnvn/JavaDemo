package com.example.springthymeleaf.service;

import com.example.springthymeleaf.entity.BookEntity;
import com.example.springthymeleaf.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepo bookRepo;

    @Override
    public BookEntity addBook(BookEntity bookEntity) {
        BookEntity book = bookRepo.save(bookEntity);
        return book;
    }

    @Override
    public List<BookEntity> getAllBook() {
        return bookRepo.findAll();
    }

    @Override
    public BookEntity getBookById(int id) {
        return bookRepo.findById(id).get();
    }

    @Override
    public BookEntity editBook(BookEntity bookEntity) {
        BookEntity book = bookRepo.save(bookEntity);
        return book;
    }

    @Override
    public void deleteBook(int id) {
        bookRepo.deleteById(id);
    }
}
