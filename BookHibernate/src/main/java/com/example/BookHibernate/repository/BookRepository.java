package com.example.BookHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookHibernate.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
}
