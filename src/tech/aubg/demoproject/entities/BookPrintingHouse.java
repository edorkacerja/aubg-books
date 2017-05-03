package tech.aubg.demoproject.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_printing_house")
public class BookPrintingHouse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 109865929574863545L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_printing_house_id")
	int bookPrintingHouseId;
	
	@Column(name="name")
	String name;
	
	@Column(name="address")
	String address;

	
	
	public BookPrintingHouse() {
		super();
	}

	public int getBookPrintingHouseId() {
		return bookPrintingHouseId;
	}

	public void setBookPrintingHouseId(int bookPrintingHouseId) {
		this.bookPrintingHouseId = bookPrintingHouseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
