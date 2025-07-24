package Homework;

import java.util.Arrays;

public class Homework8 {

	public static void main(String[] args) {
		
		String[] menu = {"Burrger" , "Pizza" , "Pasta"};
		String[] add = {"Salad", "Soup" };
		System.out.println("어제 메뉴판 : " + String.join(" , ", menu) );
		String[] todayMenu = new String[menu.length+add.length];
		System.arraycopy(menu, 0, todayMenu, 0, menu.length);
		System.arraycopy(add, 0, todayMenu, menu.length, add.length);
		
		System.out.println("오늘 메뉴판 : " + String.join(" , ", todayMenu) );
		
	}

}
