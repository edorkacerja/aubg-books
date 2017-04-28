package tech.aubg.demoproject.services;

import java.util.List;

import tech.aubg.demoproject.entities.Author;

public interface AuthorService {
	
	public List<Author> getAuthors();

	public void saveAuthor(Author author);

	public Author getAuthor(int authorId);

}
