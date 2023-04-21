package com.onkar.BookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onkar.BookStore.service.MyBookListService;

@Controller
public class MyBookListController {
	
	@Autowired
	MyBookListService myBookListService;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyString(@PathVariable("id") int id)
	{
		this.myBookListService.deleteById(id);
		return "redirect:/my_books";
	}

}
