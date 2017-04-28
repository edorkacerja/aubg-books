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
import tech.aubg.demoproject.services.AuthorService;
import tech.aubg.demoproject.services.BookService;

@Controller
@RequestMapping("/books")
public class BooksController {
	
	@Autowired
	BookService bookService;
	@Autowired
	AuthorService authorService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getBooks(Model theModel){
		List<Book> myBooks = bookService.getBooks();
		theModel.addAttribute("books_attribute", myBooks);
		return "list_books";
	}
	
	
	@RequestMapping(value="/newBook", method=RequestMethod.GET)
	public String showFormForNewBook(Model theModel){
		
		Book mBook = new Book();
		theModel.addAttribute("book", mBook);
		
		List<Author> authors = authorService.getAuthors();
		theModel.addAttribute("authors", authors);
		
		return "new_book";
	}
	
	
	@RequestMapping(value="/saveBook", method=RequestMethod.POST)
	public String saveNewBook(@ModelAttribute("book") Book newBook){
		
		bookService.saveBook(newBook);
		
		
		return "redirect:/books/list";
	}
	
	
	@RequestMapping(value="/updateBook", method=RequestMethod.GET)
	public String updateBook(@RequestParam("bookId") int bookId, Model theModel){
		
		Book myBook = bookService.getBook(bookId);
		
		theModel.addAttribute("book", myBook);
		
		return "new_book";
	}
	
	


}
