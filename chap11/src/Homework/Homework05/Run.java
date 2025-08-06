package Homework.Homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth_day = sc.nextLine();
		
		String year = (String) birth_day.subSequence(2, 4);
		String day = birth_day.substring(6);
		String name2 = name.substring(1);
		
		
		System.out.println("암호 : " + name.charAt(0) + year + day + name2);
		
		
	}

}
