package tech.aubg.demoproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tech.aubg.demoproject.entities.Author;
import tech.aubg.demoproject.entities.Book;
import tech.aubg.demoproject.entities.BookPrintingHouse;
import tech.aubg.demoproject.services.AuthorService;
import tech.aubg.demoproject.services.BookPrintingHouseService;
import tech.aubg.demoproject.services.BookService;


@Controller
@RequestMapping("/books")
public class BooksController {
	
	@Autowired
	BookService bookService;
	@Autowired
	AuthorService authorService;
	@Autowired
	BookPrintingHouseService houseService;
	
	/**
	 * @param theModel
	 * @description this method uses bookService to get a List of all the Books
	 *  which are present in the database and adds the list as an attribute to the model.
	 * @return list_books.jsp page
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getBooks(Model theModel){
		List<Book> myBooks = bookService.getBooks();
		theModel.addAttribute("books_attribute", myBooks);
		return "list_books";
	}
	
	
	/**
	 * @param theModel
	 * @description creates a new Book object and adds it as an attribute to the model.
	 * Also gets a list of all the Authors in the database and ads them to the model.
	 * @return the new_book.jsp page
	 */
	@RequestMapping(value="/newBook", method=RequestMethod.GET)
	public String showFormForNewBook(Model theModel){
		
		Book mBook = new Book();
		theModel.addAttribute("book", mBook);
		
		List<Author> authors = authorService.getAuthors();
		theModel.addAttribute("authors", authors);
		
		List<BookPrintingHouse> houses = houseService.getBookPrintingHouses();
		theModel.addAttribute("houses", houses);
		
		return "new_book";
	}
	
	
	/**
	 * @param newBook
	 * @description saves the newBook parameter to the database using the bookService.
	 * Then after that is done, it redirects the browser to the /books/list URL.
	 * @return
	 */
	@RequestMapping(value="/saveBook", method=RequestMethod.POST)
	public String saveNewBook(@ModelAttribute("book") Book newBook){
		
		bookService.saveBook(newBook);
		
		
		return "redirect:/books/list";
	}
	
	
	/**
	 * @param bookId
	 * @param theModel 
	 * @description this method uses bookService to get the book with the specific id specified from the parameter bookId.
	 *  then adds that book to the model. 
	 * @return the new_book.jsp page
	 */
	@RequestMapping(value="/updateBook", method=RequestMethod.GET)
	public String updateBook(@RequestParam("bookId") int bookId, Model theModel){
		
		Book myBook = bookService.getBook(bookId);
		theModel.addAttribute("book", myBook);
		
		List<Author> authors = authorService.getAuthors();
		theModel.addAttribute("authors", authors);
		
		List<BookPrintingHouse> houses = houseService.getBookPrintingHouses();
		theModel.addAttribute("houses", houses);
		
		return "new_book";
	}
	
	/**
	 * @param bookId
	 * @param theModel
	 * @description this method uses bookService to delete the book with id bookId from the database.
	 * then it redirects the browser to the /books/list URL.
	 * @return
	 */
	@RequestMapping(value="/deleteBook")
	public String deleteBook(@RequestParam("bookId") int bookId, Model theModel) {
		
		bookService.deleteBook(bookId);
		
		return "redirect:/books/list";
	}


}
