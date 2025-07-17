package HomeWork;

import java.util.Scanner;

public class HomeWokr5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("국어 : ");
		int a = sc.nextInt();
		System.out.printf("영어 : ");
		int b = sc.nextInt();
		System.out.printf("수학 : ");
		int c = sc.nextInt();
		
		System.out.println("총점: " + (a+b+c));
		System.out.println("평균: " + (a+b+c)/3);
		
		
		
	}

}
