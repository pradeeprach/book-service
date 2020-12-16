package com.microservices.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BOOK")
@Getter
@Setter
public class Book {

	@Id
    @SequenceGenerator(name = "BOOK_ID_GENERATOR_SEQ", sequenceName  = "BOOK_ID_GENERATOR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "BOOK_ID_GENERATOR_SEQ")
    @Column(name = "BOOK_ID", nullable = false)
	private Long id;
	
	@Column(name = "TITLE", nullable = false, length = 100)
	private String title;
	
	@Column(name = "AUTHOR", nullable = false, length = 100)
	private String author;
	
	@Column(name = "YEAR", nullable = false, length = 4)
	private String year;
	
	@Column(name = "PUBLISHER", nullable = false, length = 100)
	private String publisher;
	
	@Column(name = "PRICE", nullable = false)
	private double price;
	
	@Column(name = "ISBN", unique = true, length = 13)
	private String isbn;
}
