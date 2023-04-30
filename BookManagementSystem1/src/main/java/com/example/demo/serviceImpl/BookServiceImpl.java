package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.BookRepository;
import com.example.demo.services.BookService;
import com.example.demo.entity.Book;

public class BookServiceImpl implements BookService{
	@Autowired
	BookRepository bookRepo;
	
	@Override
	public Book addBook(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

}