package tech.aubg.demoproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	
	@RequestMapping("/")
	public String getWelcomePage(Model theModel){
		
		return "index";
	}
	
}