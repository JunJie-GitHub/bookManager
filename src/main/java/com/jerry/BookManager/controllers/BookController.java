package com.jerry.BookManager.controllers;

import com.jerry.BookManager.model.Book;
import com.jerry.BookManager.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/book/{id}")
    public Book getBookById(@PathVariable int id){
       return bookService.selectBookById(id);
    }

    @GetMapping(value = "/book")
    public List<Book> allBook(){
        return bookService.selectAllBook();
    }

    @GetMapping(value = "/test")
    public String test(){
        System.out.println("testMapping");
        return "success3";
    }
}
