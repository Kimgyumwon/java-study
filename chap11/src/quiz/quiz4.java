package quiz;

import java.util.Iterator;
import java.util.Scanner;

public class quiz4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 : ");
		int a = sc.nextInt();
		String[] student = new String[a];
		sc.nextLine();
		for (int i = 0; i < student.length; i++) {
			System.out.print("학생 이름 입력 : ");
			student[i] = sc.nextLine();
		}
		int coffee = (int) (Math.random()*a);
		System.out.println("☕ 당첨: " +student[coffee]);
		
		
	}
}
