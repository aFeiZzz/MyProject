package com.example.review.dao;

import com.example.review.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> userLogin(@Param("user") User user);
}
