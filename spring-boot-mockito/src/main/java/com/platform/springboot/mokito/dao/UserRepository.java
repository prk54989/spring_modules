package com.platform.springboot.mokito.dao;

import java.util.List;

import com.platform.springboot.mokito.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String>{

    List<User> findByAddress(String address);

}
