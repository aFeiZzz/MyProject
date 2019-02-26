package com.example.review.controller;

import com.example.review.bean.User;
import com.example.review.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userLogin(ModelMap map,String userName,String password){
        User user=new User();
        user.setU_password(password);
        user.setU_userName(userName);
        if (userService.login(user)){
            map.addAttribute("userName",user);
            return "index";
        }
       return "login";
    }
}
