package com.microservices.book.service;

import java.util.List;

import com.microservices.book.entity.Book;

public interface BookService {

	List<Book> getAllBooks();
	Book getBookById(Long bookID);
	Book addBook(Book book);
	boolean deleteBook(Long bookID);
	Book updateBookDetails(Long bookID, Book book);
}
