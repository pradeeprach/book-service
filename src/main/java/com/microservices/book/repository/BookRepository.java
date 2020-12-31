package com.microservices.book.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.book.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String>{

}
