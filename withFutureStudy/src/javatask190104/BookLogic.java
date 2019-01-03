package javatask190104;

//update와 delete부분을 처리했는데 스트림이 이미 실행되었거나 클로즈되었다고 나옵니다.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookLogic {
	ArrayList<Book> book;
	Stream<Book> bookStream;
	
	public BookLogic() {
		book = new ArrayList<Book>();
		bookStream = book.stream();
	}

	public void printMainMenu(){
		System.out.println("==================메 뉴==================");
		System.out.println("1.도서 전체 조회 2.key로 조회 3.도서 추가 4.도서 수정 5.도서 삭제 9.종료");
		System.out.println("=======================================");
		System.out.println("번호를 입력하세요.");
	}
	
	public int getMenuNumber(){
		Scanner sc = new Scanner(System.in);
		int menuNumber = 0;
		while (true) {
			try {
				menuNumber = Integer.parseInt(sc.nextLine());
				break;

			} catch (NumberFormatException e) {
				System.out.println("해당 번호를 입력하세요.");
			}
		}
		return menuNumber;
	}

	public void separateMenu(int mainMenu) {

			switch (mainMenu) {
			case 1:// 도서 전체 조회
				searchTotal();
				break;
			case 2:// key로 도서 조회 
				searchBook();
				break;
			case 3:// 도서 추가
				insertBook();
				break;
				
			case 4:// 도서 수정
				updateBook();
				break;
				
			case 5:// 도서 삭제
				deleteBook();
				break;
				
			case 9:// 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("해당 번호를 입력하세요.");
			}
	}

	private void searchTotal() {
		//for(Book b:book) b.print();
		bookStream.sorted().forEach(System.out::println);
	}

	private Book getBookByName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("도서명을 검색하세요.");
		//String nameTemp;
		String searchName = sc.nextLine();
		//for(Book b : book){
			//if(searchName.equals(b.bookName))
		book.stream().filter(i -> i.equals(searchName));
		
		System.out.println(searchName+"으로 검색한 정보가 없습니다.");
		return null;
		
	}
	private void searchBook(){
		Book book = getBookByName();
		/*
		if(book != null){
			System.out.println("검색 결과");
			book.print();
		}*/
		bookStream.sorted().forEach(System.out::println);
	}
	
	private void insertBook() {
		System.out.println("도서 장르를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String genre = sc.nextLine();
		System.out.println("도서 이름을 입력하세요.");
		String bookName = sc.nextLine();
		System.out.println("저자를 입력하세요.");
		String author = sc.nextLine();
		
	
		book.add(new Book(genre, bookName, author));
		/*	
		book.forEach(i -> i.setGenre(genre));
		book.forEach(i -> i.setBookName(bookName));
		book.forEach(i -> i.setAuthor(author));
			*/
		bookStream.sorted().forEach(System.out::println);
	}
	private void updateBook() {
		Scanner sc = new Scanner(System.in);
		Book bk = getBookByName();
		
		if(bk != null){
			/*bookStream(i -> {
				return i.equals(bk);
			});*/
			bookStream.sorted().forEach(System.out::println);
			/*System.out.println("도서 장르를 입력하세요.");
			String tempGenre = sc.nextLine();
			System.out.println("책 이름를 입력하세요.");
			String tempBookName = sc.nextLine();
			System.out.println("저자를 입력하세요.");
			String tempAuthor = sc.nextLine();*/
			book.forEach(i -> i.setGenre(i.getGenre()));
			book.forEach(i -> i.setBookName(i.getBookName()));
			book.forEach(i -> i.setAuthor(i.getAuthor()));
			book.forEach(System.out::println);
			/*for(Book b: book){
				if(b.equals(bk)){
					b.print();
					System.out.println("도서 장르를 입력하세요.");
					String tempGenre = sc.nextLine();
					System.out.println("책 이름를 입력하세요.");
					String tempBookName = sc.nextLine();
					System.out.println("저자를 입력하세요.");
					String tempAuthor = sc.nextLine();
					b.setGenre(tempGenre);
					b.setBookName(tempBookName);
					b.setAuthor(tempAuthor);
					b.print();
					break;
				}
			}*/
		}
	}
	private void deleteBook() {
		Book bk = getBookByName();
		if(bk != null){
			book.removeIf(i -> {
				return i.equals(bk);
			});
			System.out.println(bk.getBookName()+"가(이) 삭제되었어요.");
			/*for(Book b: book){
				if(b.equals(bk)){
					System.out.println(b.getBookName()+"가(이) 삭제되었어요.");
					book.remove(bk);
					break;
				}
			}*/
		}
	}
}
