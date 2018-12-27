package javatask181228;

import java.io.Serializable;

public class Book implements Serializable {
	public String genre; //장르
	public String bookName; //책이름
	public String author; //저자
	
	public Book() {}
	
	public Book(String genre, String bookName, String author) {
		this.genre = genre;
		this.bookName = bookName;
		this.author = author;
	}

	public String get(){
		return String.format("장르 :%s, 책이름 :%s, 저자 :%s",genre,bookName,author);
		
	}
	public void print(){
		System.out.println(get());
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
