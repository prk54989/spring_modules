package com.platform.springboot.mokito.service;

import java.util.List;

import com.platform.springboot.mokito.dao.UserRepository;
import com.platform.springboot.mokito.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User addUser(User user) {
        return repository.save(user);
    }

    public List<User> getUsers() {
        List<User> users = repository.findAll();
        System.out.println("Getting data from DB : " + users);
        return users;
    }

    public List<User> getUserbyAddress(String address) {
        return repository.findByAddress(address);
    }

    public void deleteUser(User user) {
        repository.delete(user);
    }
}
