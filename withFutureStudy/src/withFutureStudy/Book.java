package withFutureStudy;

import java.io.Serializable;

public class Book implements Serializable {
	public int bookCode; //���� �ڵ�
	public String genre; //���� �帣
	public String bookName; //���� �̸�
	public String author; //���� 
	
	public Book() {}
	
	public Book(int bookCode, String genre, String bookName, String author) {
		this.bookCode = bookCode;
		this.genre = genre;
		this.bookName = bookName;
		this.author = author;
	}

	public String get(){
		return String.format("���� �ڵ� :%s","�帣 :%s","���� �̸� :%s","����:%s",bookCode,genre,bookName,author);
		
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
