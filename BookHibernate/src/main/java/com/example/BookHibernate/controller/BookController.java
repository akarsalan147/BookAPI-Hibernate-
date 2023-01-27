package com.example.BookHibernate.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookHibernate.model.Book;
import com.example.BookHibernate.service.BookService;

@RestController
public class BookController {
	
	private static Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/book/{id}")
	public Book getBookById(@RequestParam("id") int id) {
		return bookService.getBookById(id);
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@PostMapping("/createBook")
	public ResponseEntity createBook(@RequestBody @Validated Book book) {
		bookService.createBookStatic(book);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public void deleteBookById(@PathVariable("id") int id) {
		bookService.deleteBook(id);
	}
	
}
