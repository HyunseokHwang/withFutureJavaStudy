package javatask181228;

public class BookListApp {

	public static void main(String[] args) {
		BookLogic logic = new BookLogic();
		
		while(true){
		logic.printMainMenu();
		int mainMenu = logic.getMenuNumber();
		logic.separateMenu(mainMenu);
		}
	}/////////////////main

}/////////////class
