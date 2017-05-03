package tech.aubg.demoproject.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6150824772422467970L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	int bookId;

	@Column(name = "title")
	String title;

	@Column(name = "pages")
	int pages;

	@ManyToOne
	@JoinColumn(name = "author_id")
	Author author;

	public Book() {

	}

	public int getBookId() {
		return bookId;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author= author;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
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
		return "Book [bookId=" + bookId + ", title=" + title + ", pages=" + pages + "]";
	}

}
