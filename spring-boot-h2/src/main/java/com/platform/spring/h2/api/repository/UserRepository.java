package com.platform.spring.h2.api.repository;

import com.platform.spring.h2.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}