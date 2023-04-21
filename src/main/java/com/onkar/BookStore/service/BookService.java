package com.onkar.BookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onkar.BookStore.entity.Book;
import com.onkar.BookStore.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	
	public void save(Book book)
	{
		this.bookRepository.save(book);
	}
	
	public List<Book> getAllBook()
	{
		return this.bookRepository.findAll();
	}
	
	public Book getBookById(int id)
	{
		return this.bookRepository.findById(id).get();
	}
	
	public void deleteById(int id)
	{
		this.bookRepository.deleteById(id);
	}

}
