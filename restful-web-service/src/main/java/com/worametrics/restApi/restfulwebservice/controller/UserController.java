package com.worametrics.restApi.restfulwebservice.controller;

import com.worametrics.restApi.restfulwebservice.dao.UserDao;
import com.worametrics.restApi.restfulwebservice.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserDao userDao;

    public UserController(UserDao userDao){
        this.userDao = userDao;
    }

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){
        return userDao.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User findByUserID(@PathVariable int id){
        return userDao.findByID(id);
    }
}
