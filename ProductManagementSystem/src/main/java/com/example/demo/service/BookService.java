package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface BookService {
	public Book addBook(Book book);
	public Book getBookById(int id);
	public Book updateBookById(int id, Book book);
	public void deleteBookById(int id);	
	public Book findBookByName(String name);
	public Book findBookByPrice(int price);
	public List<Book> getAllBook();
}