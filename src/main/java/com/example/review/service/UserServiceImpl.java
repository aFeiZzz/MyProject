package com.example.review.service;

import com.example.review.bean.User;
import com.example.review.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public boolean login(User user) {
        List<User> users=userDao.userLogin(user);
        if (users==null){
            return false;
        }else {
            return true;
        }

    }
}
