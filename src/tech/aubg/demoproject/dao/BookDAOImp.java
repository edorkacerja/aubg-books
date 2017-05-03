package tech.aubg.demoproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tech.aubg.demoproject.entities.Book;

@Repository
public class BookDAOImp implements BookDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Book> getBooks() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Book> myQuery = currentSession.createQuery("select b from Book as b join b.author", Book.class);

		List<Book> books = myQuery.getResultList();

		return books;
	}

	@Override
	@Transactional
	public void saveBook(Book newBook) {

		// get current session from hibernate
		Session currentSession = sessionFactory.getCurrentSession();

		// save the new book
		currentSession.saveOrUpdate(newBook);

	}

	@Override
	@Transactional
	public Book getBook(int bookId) {

		Session currentSession = sessionFactory.getCurrentSession();

		Book book = currentSession.get(Book.class, bookId);

		return book;
	}

	@Override
	@Transactional
	public void deleteBook(int bookId) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<?> theQuery = currentSession.createQuery("delete from Book where bookId=" + bookId);

		theQuery.executeUpdate();

	}

}
