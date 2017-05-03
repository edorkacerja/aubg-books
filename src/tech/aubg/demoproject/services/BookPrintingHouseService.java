package tech.aubg.demoproject.services;

import java.util.List;

import tech.aubg.demoproject.entities.BookPrintingHouse;

public interface BookPrintingHouseService {
	
	public List<BookPrintingHouse> getBookPrintingHouses();
	
	public void saveBookPrintingHouse(BookPrintingHouse bookPrintingHouse);
	
	public void deleteBookPrintingHouse(int bookPrintingHouseId);

}
