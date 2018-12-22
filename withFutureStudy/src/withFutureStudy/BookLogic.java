package withFutureStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class BookLogic {
	ArrayList<Book> book;
	
	public BookLogic() {
		book = new ArrayList();
	}

	public void printMainMenu(){
		System.out.println("==================�� ��==================");
		System.out.println("1.���� ��ȸ 2.���� �Է� 3.���� ���� 4.���� ���� 9.����");
		System.out.println("=======================================");
		System.out.println("��ȣ�� �Է��ϼ���.");
	}
	
	public int getMenuNumber(){
		Scanner sc = new Scanner(System.in);
		int menuNumber = 0;
		while (true) {
			try {
				menuNumber = Integer.parseInt(sc.nextLine());
				break;

			} catch (NumberFormatException e) {
				System.out.println("�ش� ��ȣ�� �Է��ϼ���.");
			}
		}
		return menuNumber;
	}

	public void separateMenu(int mainMenu) {

			switch (mainMenu) {
			case 1:// ���� ��ȸ
				while(true){
					System.out.println("============�� ��============");
					System.out.println("1.�˻� ��ȸ 2.��ü ��ȸ 9.�ڷ� ���ư���");
					System.out.println("===========================");
					int subMenu = getMenuNumber();
					if(subMenu == 9){break;}
					switch(subMenu){
					case 1: searchBook();break;
					case 2:	searchTotal(); break;
					default : System.out.println("���� ���� �޴��Դϴ�."); continue;
					}
				}
				break;
			case 2:// ���� �Է�
				insertBook();
				break;
			case 3:// ���� ����
				updateBook();
				break;
				
			case 4:// ���� ����
				deleteBook();
				break;
				
			case 9:// ����
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("�ش� ��ȣ�� �Է��ϼ���.");
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
		System.out.println("���� �帣�� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String genre = sc.nextLine();
		System.out.println("���� �̸��� �Է��ϼ���.");
		String bookName = sc.nextLine();
		System.out.println("���ڸ� �Է��ϼ���.");
		String author = sc.nextLine();
		int bookCode = 0;
		while (true) {
			System.out.println("���� �ڵ带 ���ڷ� �� �ڸ� �Է��ϼ���");
			try {
				bookCode = Integer.parseInt(sc.nextLine());
				break;

			} catch (NumberFormatException e) {
				System.out.println("���� �ڵ�� ���ڸ� �Է��ϼ���.");
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
