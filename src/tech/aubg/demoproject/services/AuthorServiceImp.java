package tech.aubg.demoproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.aubg.demoproject.dao.AuthorDAO;
import tech.aubg.demoproject.entities.Author;

@Service
public class AuthorServiceImp implements AuthorService{

	@Autowired
	AuthorDAO authorDAO;
	
	
	@Override
	public List<Author> getAuthors() {
		
		List<Author> authors = authorDAO.getAuthors();
		
		return authors;
	}

}
