package com.worametrics.restApi.restfulwebservice.dao;

import com.worametrics.restApi.restfulwebservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
