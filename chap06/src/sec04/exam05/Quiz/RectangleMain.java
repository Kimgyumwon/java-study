package sec04.exam05.Quiz;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
	
		rect.area();
		rect.length();
		
		

	}

}
