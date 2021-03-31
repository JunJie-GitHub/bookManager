package com.jerry.BookManager.dao;

import com.jerry.BookManager.model.Book;
import com.jerry.BookManager.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    String tableName = "user";
    String insertField = "name, email, password";
    String selectField = "id, " + insertField;

    /**
     * 插入用户
     */
    @Insert({"insert into", tableName,"(",insertField,")", "values(#{name}, #{email}, #{password})"} )
    int insertUser(User user);

    /**
     * 根据id删除用户
     */
    @Delete({"delete from", tableName, "where id = #{id}"})
    int deleteUserById(int id);

    /**
     * 查询用户
     */
    @Select({"select", selectField, "from user where id = #{id}"})
    User selectUserById(int id);

    @Select({"select", selectField, "from user where id = #{email}"})
    User selectUserByEmail(String email);

    @Select({"select * from", tableName})
    List<User> selectAllUser();
    /**
     * 修改用户
     */
    @Update({"UPDATE", tableName, "SET name = #{name}, email = #{email}, password = #{password} WHERE id = #{id}"})
    boolean updateBook(User user);
}
