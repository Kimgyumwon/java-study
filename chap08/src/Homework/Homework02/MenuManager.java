package Homework.Homework02;

import java.util.Random;

public class MenuManager {

	public static void main(String[] args) {
		menu[] m1 = new menu[5];
		for(int i = 0; i<m1.length; i++) {
			int random = (int)(Math.random()*2);
			if(random == 0) {
				m1[i] = new Dish("김치찌개", 30000, "돼지고기");
			} else {
				m1[i] = new Drink("커피", 2000,"원두");
			}
		}
		
		for (menu m2 : m1) {
			m2.cook();
		}
		
		
		
		
	}

}
