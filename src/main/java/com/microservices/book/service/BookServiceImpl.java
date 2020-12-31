package com.microservices.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.book.entity.Book;
import com.microservices.book.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookById(String bookID) {
		Book book = null;
		Optional<Book> optionalBook = bookRepository.findById(bookID);
		if (optionalBook.isPresent()) {
			book = optionalBook.get();
		}
		return book;
	}

	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	public boolean deleteBook(String bookID) {
		bookRepository.deleteById(bookID);
		return !bookRepository.existsById(bookID);
	}

	public Book updateBookDetails(String bookID, Book book) {
		Book updatedBook = null;
		if (bookRepository.existsById(bookID) && book.getId().equals(bookID)) {
			updatedBook = bookRepository.save(book);
		}
		return updatedBook;
	}
}
