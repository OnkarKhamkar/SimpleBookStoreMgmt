package com.onkar.BookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="my_books")
public class MyBookList {
	
	@Id
	
	int id;
	String name;
	String author;
	String price;
	
	public MyBookList() {
		// TODO Auto-generated constructor stub
	}
	
	public MyBookList(int id, String name, String author, String price)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
