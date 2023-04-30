package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.services.BookService;
import com.example.demo.entity.Book;

public class Controller {
	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	
	@GetMapping("/books")
	public List<Book> getAllBook(){
		return this.bookService.getAllBook();
	}

}
