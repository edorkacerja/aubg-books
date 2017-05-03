package tech.aubg.demoproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tech.aubg.demoproject.entities.BookPrintingHouse;

@Repository
public class BookPrintingHouseDAOImpl implements BookPrintingHouseDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<BookPrintingHouse> getAllBookPrintingHouses() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<BookPrintingHouse> query = currentSession.createQuery("from BookPrintingHouse order by name",
				BookPrintingHouse.class);

		List<BookPrintingHouse> list = query.getResultList();

		return list;
	}

	@Override
	@Transactional
	public void deleteBookPrintingHouse(int bookPrintingHouseId) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<?> theQuery = currentSession
				.createQuery("delete from BookPritingHouse where bookPrintingHouseId=" + bookPrintingHouseId);

		theQuery.executeUpdate();

	}

	@Override
	public void saveBookPrintingHouse(BookPrintingHouse bookPrintingHouse) {
		
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(bookPrintingHouse);

	}

}
