package Homework.Homework03;

import java.util.Scanner;

public class StringPulsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		StringPuls my = new StringPuls();
		String a = my.str(str1, str2);
		int b = my.multiplication(x, y);
		boolean c = my.equals(str1, str2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
