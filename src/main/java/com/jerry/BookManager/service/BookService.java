package com.jerry.BookManager.service;

import com.jerry.BookManager.dao.BookDao;
import com.jerry.BookManager.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public Book selectBookById(int id){
       return bookDao.selectBookById(id);
    }

    public List<Book> selectAllBook(){
        return bookDao.selectAllBook();
    }

    public int insertBook(Book book){
        return bookDao.insertBook(book);
    }

    public int deleteBook(int id){
        return bookDao.deleteBookById(id);
    }

    public int updateBook(Book book){
        return bookDao.updateBookById(book);
    }
}
