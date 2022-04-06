package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;


@RestController
public class BookController 
	{
		@Autowired
		BookService bookService;
		
		@GetMapping("/book")
		private List<Book> getAllBook() 
		{
			return bookService.getAllBook();
		}
		
		@GetMapping("/book/{isbn}")
		private Book getBook(@PathVariable("isbn") int isbn) 
		{
			return bookService.getBookById(isbn);
		}
		
		@DeleteMapping("/book/{isbn}")
		private String bookCourse(@PathVariable("isbn") int isbn) 
		{
			bookService.delete(isbn);
			return isbn+" "+"Deleted";
		}
		
		@PostMapping("/book")
		private int saveBook(@RequestBody Book book) 
		{
			bookService.saveOrUpdate(book);
			return book.getIsbn();
		}
	}


