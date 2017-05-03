package tech.aubg.demoproject.dao;

import java.util.List;

import tech.aubg.demoproject.entities.BookPrintingHouse;

public interface BookPrintingHouseDAO {
	
	public List<BookPrintingHouse> getAllBookPrintingHouses();
	
	public void saveBookPrintingHouse(BookPrintingHouse bookPrintingHouse);
	
	public void deleteBookPrintingHouse(int bookPrintingHouseId);

}
