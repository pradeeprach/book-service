package com.microservices.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.book.entity.Book;
import com.microservices.book.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books/{book_id}")
	public Book getBookByID(@PathVariable(name = "book_id") String bookID) {
		return bookService.getBookById(bookID);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	@DeleteMapping("/books/{book_id}")
	public boolean deleteBook(@PathVariable(name = "book_id") String bookID) {
		return bookService.deleteBook(bookID);
	}
	
	@PutMapping("books/{book_id}")
	public Book updateBook(@PathVariable(name = "book_id") String bookID, @RequestBody Book book) {
		return bookService.updateBookDetails(bookID, book);
	}
}
