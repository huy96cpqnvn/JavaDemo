package com.example.springthymeleaf.controller;

import com.example.springthymeleaf.entity.BookEntity;
import com.example.springthymeleaf.entity.CategoryEntity;
import com.example.springthymeleaf.service.BookService;
import com.example.springthymeleaf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    BookService bookService;
    CategoryService categoryService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        String message = "This is Dashboard";
        model.addAttribute("mes", message);
        return "index";
    }

    @GetMapping("/addbook")
    public String addBook(Model model) {
        BookEntity book = new BookEntity();
//        List<CategoryEntity> categories = categoryService.getAllCategory();
        model.addAttribute("book", book);
//        model.addAttribute("categories", categories);
        return "addbook";
    }

    @PostMapping("/addbook")
    public String addBook(@ModelAttribute BookEntity book, Model model) {
        bookService.addBook(book);
        return "redirect:/listbook";
    }

    @GetMapping("/listbook")
    public String listBook(Model model) {
        List<BookEntity> books = bookService.getAllBook();
        model.addAttribute("books", books);
        return "listbook";
    }

    @GetMapping("/detail/{id}")
    public String getDetail(Model model, @PathVariable int id) {
        BookEntity book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "detail";
    }

    @GetMapping("edit/{id}")
    public String editBook(Model model, @PathVariable int id) {
        BookEntity book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "edit";
    }

    @PostMapping("edit/{id}")
    public String editBook(Model model,@ModelAttribute BookEntity book) {
        bookService.editBook(book);
        return "redirect:/listbook";
    }

    @GetMapping("delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        bookService.deleteBook(id);
        return "redirect:/listbook";
    }

}
