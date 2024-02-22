package com.worametrics.restApi.restfulwebservice.controller;

import com.worametrics.restApi.restfulwebservice.dao.UserDao;
import com.worametrics.restApi.restfulwebservice.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping(path = "/users")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userDao.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(@PathVariable int id){
        userDao.deleteUserByID(id);
    }
}
