package tech.aubg.demoproject.dao;

import java.util.List;

import tech.aubg.demoproject.entities.Book;

public interface BookDAO {

	public List<Book> getBooks();

	public void saveBook(Book newBook);

	public Book getBook(int bookId);
}
