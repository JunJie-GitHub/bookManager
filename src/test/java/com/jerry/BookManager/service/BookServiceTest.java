package com.jerry.BookManager.service;

import com.jerry.BookManager.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void selectBookById() {
        BookService bookService = new BookService();
        System.out.println(bookService.selectBookById(1));
    }
}