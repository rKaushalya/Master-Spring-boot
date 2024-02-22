package com.worametrics.restApi.restfulwebservice.dao;

import com.worametrics.restApi.restfulwebservice.user.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDao {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Ravi", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Jack", LocalDate.now().minusYears(20)));
        users.add(new User(3,"Elsa", LocalDate.now().minusYears(18)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findByID(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
