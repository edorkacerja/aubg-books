package tech.aubg.demoproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="book_id")
	int bookId;
	
	@Column(name="title")
	String title;
	
	@Column(name="author_id")
	int authorId;
	
	@Column(name="pages")
	int pages;
	
	public Book() {
		
	}

	

	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public int getAuthorId() {
		return authorId;
	}



	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}



	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", authorId=" + authorId + ", pages=" + pages + "]";
	}

	
	
	
}
