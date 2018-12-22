package withFutureStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class BookLogic {
	ArrayList<Book> book;
	
	public BookLogic() {
		book = new ArrayList();
	}

	public void printMainMenu(){
		System.out.println("==================메 뉴==================");
		System.out.println("1.도서 조회 2.도서 입력 3.도서 수정 4.도서 삭제 9.종료");
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
			case 1:// 도서 조회
				while(true){
					System.out.println("============메 뉴============");
					System.out.println("1.검색 조회 2.전체 조회 9.뒤로 돌아가기");
					System.out.println("===========================");
					int subMenu = getMenuNumber();
					if(subMenu == 9){break;}
					switch(subMenu){
					case 1: searchBook();break;
					case 2:	searchTotal(); break;
					default : System.out.println("없는 서브 메뉴입니다."); continue;
					}
				}
				break;
			case 2:// 도서 입력
				insertBook();
				break;
			case 3:// 도서 수정
				updateBook();
				break;
				
			case 4:// 도서 삭제
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
		for(Book bk : book){
			bk.print();
		}
	}

	private void searchBook() {
		
		
	}
	
	private void insertBook() {
		System.out.println("도서 장르를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String genre = sc.nextLine();
		System.out.println("도서 이름을 입력하세요.");
		String bookName = sc.nextLine();
		System.out.println("저자를 입력하세요.");
		String author = sc.nextLine();
		int bookCode = 0;
		while (true) {
			System.out.println("도서 코드를 숫자로 세 자리 입력하세요");
			try {
				bookCode = Integer.parseInt(sc.nextLine());
				break;

			} catch (NumberFormatException e) {
				System.out.println("도서 코드는 숫자만 입력하세요.");
			}
		}
	}
	private void deleteBook() {
		// TODO Auto-generated method stub
		
	}

	private void updateBook() {
		// TODO Auto-generated method stub
		
	}

}
