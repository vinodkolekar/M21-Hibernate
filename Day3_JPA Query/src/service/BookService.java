package com.cg.service;
import java.util.List;
import com.cg.entities.Book;

public interface BookService 
{
	public abstract Book getBookById(int id);
	public abstract List<Book>getBookByTitle(String Title);
	public abstract List<Book>getAuthorBooks(String author);
	public abstract List<Book>getBookInPriceRange(double low, double high);
	public abstract List<Book>getAllBooks();
	public abstract Long getBookCount();
}