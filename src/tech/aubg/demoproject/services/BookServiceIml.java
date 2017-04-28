package tech.aubg.demoproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.aubg.demoproject.dao.BookDAO;
import tech.aubg.demoproject.entities.Book;


@Service
public class BookServiceIml implements BookService {

	@Autowired
	BookDAO bookDAO;
	
	@Override
	public List<Book> getBooks() {
		
		
		return bookDAO.getBooks();
	}

	
	
	@Override
	public void saveBook(Book newBook) {

		bookDAO.saveBook(newBook);
		
	}



	@Override
	public Book getBook(int bookId) {
		Book book = bookDAO.getBook(bookId);
		return book;
	}



	@Override
	public void deleteBook(int bookId) {

		bookDAO.deleteBook(bookId);
	}

}
