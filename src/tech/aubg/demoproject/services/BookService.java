package tech.aubg.demoproject.services;

import java.util.List;

import tech.aubg.demoproject.entities.Book;

public interface BookService {
	
	public List<Book> getBooks();

	public void saveBook(Book newBook);

	public Book getBook(int bookId);

	public void deleteBook(int bookId);

}
