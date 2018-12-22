package withFutureStudy;

import java.io.Serializable;

public class Book implements Serializable {
	public int bookCode; //도서 코드
	public String genre; //도서 장르
	public String bookName; //도서 이름
	public String author; //저자 
	
	public Book() {}
	
	public Book(int bookCode, String genre, String bookName, String author) {
		this.bookCode = bookCode;
		this.genre = genre;
		this.bookName = bookName;
		this.author = author;
	}

	public String get(){
		return String.format("도서 코드 :%s","장르 :%s","도서 이름 :%s","저자:%s",bookCode,genre,bookName,author);
		
	}
	public void print(){
		System.out.println(get());
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
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
