package com.microservices.book.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Book {

	@Id
	private String id;
	private String title;
	private String author;
	private String year;
	private String publisher;
	private double price;
	private String isbn;
}
