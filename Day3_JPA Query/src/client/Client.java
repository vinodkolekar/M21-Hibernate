package com.cg.client;
import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService obj = new BookServiceImpl();
		System.out.println("Total no. of books: ");
		System.out.println("Total books: " + obj.getBookCount());
		
		System.out.println("Listing book with id:102 ");
		System.out.println("Total books: " + obj.getBookById(102));
		
		System.out.println("Listing all books: ");
		System.out.println("Total books: " + obj.getAllBooks());
		
		System.out.println("Book written by Raviraj: ");
		System.out.println("Total books: " + obj.getAuthorBooks("Raviraj"));
		
		System.out.println("Book by title: ");
		System.out.println("Total books: " + obj.getBookByTitle("Java"));
		
		System.out.println("Listing book between 200 to 500: ");
		System.out.println("Total books: " + obj.getBookInPriceRange(200, 500));
		
	}
}
