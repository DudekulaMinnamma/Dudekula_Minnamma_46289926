package com.springboot.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.demo.model.Book;

public interface Bookrepository extends MongoRepository<Book, Integer>{

}
