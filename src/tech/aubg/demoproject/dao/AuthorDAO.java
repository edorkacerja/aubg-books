package tech.aubg.demoproject.dao;

import java.util.List;

import tech.aubg.demoproject.entities.Author;

public interface AuthorDAO {
	
	public List<Author> getAuthors();

	public void saveAuthor(Author author);

	public Author getAuthor(int authorId);

}
