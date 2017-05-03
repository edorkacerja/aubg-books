package tech.aubg.demoproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.aubg.demoproject.dao.BookPrintingHouseDAO;
import tech.aubg.demoproject.entities.BookPrintingHouse;

@Service
public class BookPrintingHouseServiceImpl implements BookPrintingHouseService {

	@Autowired
	BookPrintingHouseDAO bookPrintingHouseDAO;

	@Override
	public List<BookPrintingHouse> getBookPrintingHouses() {
		return bookPrintingHouseDAO.getAllBookPrintingHouses();
	}

	@Override
	public void deleteBookPrintingHouse(int bookPrintingHouseId) {
		bookPrintingHouseDAO.deleteBookPrintingHouse(bookPrintingHouseId);
	}

	@Override
	public void saveBookPrintingHouse(BookPrintingHouse bookPrintingHouse) {
		bookPrintingHouseDAO.saveBookPrintingHouse(bookPrintingHouse);
	}

}
