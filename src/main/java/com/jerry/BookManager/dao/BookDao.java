package com.jerry.BookManager.dao;

import com.jerry.BookManager.model.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {

    /**
     * 查询图书
     * @param id
     * @return
     */
    @Select(value = "select * from book where id = #{id}")
    Book selectBookById(int id);

    @Select(value = "select * from book")
    List<Book> selectAllBook();

    /**
     * 插入图书
     */
    @Insert(value = "insert into book(name, author, price, status) values(#{name}, #{author}, #{price}, #{status})")
    int insertBook(Book book);

    /**
     * 根据id删除图书
     */
    @Delete(value = "delete from book where id = #{id}")
    int deleteBookById(int id);

    /**
     * 更改图书
     */
    @Update(value = "update book set name=#{name}, author=#{author}, price=#{price}, status=#{status} where id=#{id}")
    int updateBookById(Book book);
}
