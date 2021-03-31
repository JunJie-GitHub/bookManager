package com.jerry.BookManager.service;

import com.jerry.BookManager.dao.UserDao;
import com.jerry.BookManager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Autowired
    private UserDao userDao;

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }

    public User selectUserById(int id) {
        return userDao.selectUserById(id);
    }

    public List<User> selectAllUser(){
        return userDao.selectAllUser();
    }

    public User selectUserByEmail(String email){
        return userDao.selectUserByEmail(email);
    }

    public boolean updateBook(User user) {
        return userDao.updateBook(user);
    }
}
