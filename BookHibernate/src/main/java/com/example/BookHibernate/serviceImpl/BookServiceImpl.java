package com.example.BookHibernate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookHibernate.exception.BookNotFoundException;
import com.example.BookHibernate.model.Book;
import com.example.BookHibernate.repository.BookRepository;
import com.example.BookHibernate.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public void createBookStatic(Book book) {
		bookRepository.save(book);
	}

	@Override
	public Book getBookById(int id) {
		return bookRepository.findById(id).orElseThrow(
				() -> new BookNotFoundException("Book with Id "+id+" not found"));
	}

	@Override
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	
	
}
