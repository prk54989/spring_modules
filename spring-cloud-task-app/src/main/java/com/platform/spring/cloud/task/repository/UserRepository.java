package com.platform.spring.cloud.task.repository;

import com.platform.spring.cloud.task.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}