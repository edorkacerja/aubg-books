package tech.aubg.demoproject.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tech.aubg.demoproject.entities.Author;

@Repository
public class AuthorDAOImp implements AuthorDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional	
	public List<Author> getAuthors() {
		
		// get current session
		Session mySession = sessionFactory.getCurrentSession();
		
		// create query to fetch all authors from db
		Query<Author> myQuery = mySession.createQuery("from Author order by name", Author.class);
		
		//execute query and get the list of authors
		List<Author> myList = myQuery.getResultList();

		return myList;
	}
	
	
	

}
