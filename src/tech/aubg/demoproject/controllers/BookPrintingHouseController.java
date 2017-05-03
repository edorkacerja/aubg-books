package tech.aubg.demoproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tech.aubg.demoproject.entities.BookPrintingHouse;
import tech.aubg.demoproject.services.BookPrintingHouseService;

@Controller
@RequestMapping("/houses")
public class BookPrintingHouseController {
	
	
	@Autowired
	BookPrintingHouseService bookPrintingHouseService;
	
	/**
	 * @param theModel
	 * @description this method uses bookService to get a List of all the Books
	 *  which are present in the database and adds the list as an attribute to the model.
	 * @return list_books.jsp page
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getBooks(Model theModel){
		List<BookPrintingHouse> myHouses = bookPrintingHouseService.getBookPrintingHouses();
		theModel.addAttribute("houses", myHouses);
		return "list_houses";
	}
	
	
	/**
	 * @param theModel
	 * @description creates a new Book object and adds it as an attribute to the model.
	 * Also gets a list of all the Authors in the database and ads them to the model.
	 * @return the new_book.jsp page
	 */
	@RequestMapping(value="/newHouse", method=RequestMethod.GET)
	public String showFormForNewBook(Model theModel){
		
		BookPrintingHouse bookPrintingHouse = new BookPrintingHouse();
		theModel.addAttribute("house", bookPrintingHouse);
		
		return "new_house";
	}
	
	
	/**
	 * @param newBook
	 * @description saves the newBook parameter to the database using the bookService.
	 * Then after that is done, it redirects the browser to the /books/list URL.
	 * @return
	 */
	@RequestMapping(value="/saveHouse", method=RequestMethod.POST)
	public String saveNewHouse(@ModelAttribute("house") BookPrintingHouse bookPrintingHouse){
		
		bookPrintingHouseService.saveBookPrintingHouse(bookPrintingHouse);
		
		return "redirect:/houses/list";
	}
	
	
	
	/**
	 * @param bookId
	 * @param theModel
	 * @description this method uses bookService to delete the book with id bookId from the database.
	 * then it redirects the browser to the /books/list URL.
	 * @return
	 */
	@RequestMapping(value="/deleteHouse")
	public String deleteBook(@RequestParam("bookPrintingHouseId") int bookPrintingHouseId, Model theModel) {
		
		bookPrintingHouseService.deleteBookPrintingHouse(bookPrintingHouseId);
		
		return "redirect:/houses/list";
	}


}
