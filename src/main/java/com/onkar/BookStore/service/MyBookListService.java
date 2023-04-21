package com.onkar.BookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onkar.BookStore.entity.MyBookList;
import com.onkar.BookStore.repository.MyBookRepository;

@Service
public class MyBookListService {
	
	@Autowired
	MyBookRepository myBookRepository;
	
	public void saveMyBooks(MyBookList book)
	{
		this.myBookRepository.save(book);
	}
	
	public List<MyBookList> getAllMyBooks()
	{
		return myBookRepository.findAll();
	}
	
	public void deleteById(int id)
	{
		this.myBookRepository.deleteById(id);
	}

}
