package com.microservices.book.service;

import java.util.List;

import com.microservices.book.entity.Book;

public interface BookService {

	List<Book> getAllBooks();
	Book getBookById(String bookID);
	Book addBook(Book book);
	boolean deleteBook(String bookID);
	Book updateBookDetails(String bookID, Book book);
}
