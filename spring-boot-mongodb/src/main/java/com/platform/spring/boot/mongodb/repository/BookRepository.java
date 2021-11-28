package com.platform.spring.boot.mongodb.repository;

import com.platform.spring.boot.mongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface BookRepository extends MongoRepository<Book, Integer>{

}