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
import tech.aubg.demoproject.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorsController {
	
	@Autowired
	AuthorService authorService;

	/**
	 * @param theModel
	 * @description this method uses authorService to get a List of all the Authors
	 *  which are present in the database and adds the list as an attribute to the model.
	 * @return list_authors.jsp page
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getAuthors(Model theModel){
		
		// get all the authors from the database using the service
		List<Author> authors = authorService.getAuthors();
		
		// add the list of authors as an attribute to out model container
		theModel.addAttribute("authors", authors);
		
		return "list_authors";
	}
	
	
	/**
	 * @param theModel
	 * @description creates a new Author object and adds it as an attribute to the model.
	 * @return the new_author.jsp page
	 */
	@RequestMapping(value="/newAuthor", method=RequestMethod.GET)
	public String showFormForNewAuthor(Model theModel){
		
		Author author = new Author();
		
		theModel.addAttribute("author", author);
	
		return "new_author";
	}
	
	
	/**
	 * @param author
	 * @description saves the newBook parameter to the database using the bookService.
	 * Then after that is done, it redirects the browser to the /books/list URL.
	 * @return
	 */
	@RequestMapping(value="/saveAuthor", method=RequestMethod.POST)
	public String saveAuthor(@ModelAttribute(value="author") Author author){
		
		//save new author to db
		authorService.saveAuthor(author);
		
		
		return "redirect:/authors/list";
	}
	
	


	/**
	 * @param authorId
	 * @param theModel
	 * @description this method uses authorService to get the author with the specific id specified from the parameter authorId.
	 *  then adds that author to the model. 
	 * @return the new_author.jsp page
	 */
	@RequestMapping(value="/updateAuthor", method=RequestMethod.GET)
	public String updateAuthor(@RequestParam(value="authorId") int authorId, Model theModel){
		
		// get the author for the passed id 
		Author author = authorService.getAuthor(authorId);
		
		// add it to the model as a model attribute and put the same name so the new_author.jsp page can bind it automatically
		theModel.addAttribute("author", author);
		
		return "new_author";		
	}
}
