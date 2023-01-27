package com.example.BookHibernate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BookHibernate.model.Book;

public interface BookService {
	
	void createBookStatic(Book book);
	Book getBookById(int id);
	void deleteBook(int id);
	List<Book> getAllBooks();
	
}