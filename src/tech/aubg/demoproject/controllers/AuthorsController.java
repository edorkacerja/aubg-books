package tech.aubg.demoproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tech.aubg.demoproject.entities.Author;
import tech.aubg.demoproject.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorsController {
	
	@Autowired
	AuthorService authorService;

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getAuthors(Model theModel){
		
		// get all the authors from the database using the service
		List<Author> authors = authorService.getAuthors();
		
		// add the list of authors as an attribute to out model container
		theModel.addAttribute("authors", authors);
		
		return "list_authors";
	}
}
