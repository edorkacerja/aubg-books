package tech.aubg.demoproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	
	/**
	 * @param theModel
	 * @return the entry point of the application. returns index.jsp page which is the welcome page.
	 */
	@RequestMapping("/")
	public String getWelcomePage(Model theModel){
		
		return "index";
	}
	
}
