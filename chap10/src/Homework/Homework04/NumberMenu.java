package Homework.Homework04;

import java.util.Scanner;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int a = sc.nextInt();
		System.out.print("정수2 : ");
		int b = sc.nextInt();
		NumberController num = new NumberController();
		try {
		num.checkDouble(a, b);
		}catch(NumRangeException e) {
		}
		System.out.println(a + "은(는)" + b + "의 배수인가? " + num.checkDouble(a, b));
		
	}
}
