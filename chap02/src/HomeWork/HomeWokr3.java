package HomeWork;

import java.util.Scanner;

public class HomeWokr3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		char a,b,c;
		a=input.charAt(0);
		b=input.charAt(1);
		c=input.charAt(2);
		System.out.println("첫번째 문자: " + a);
		System.out.println("두번째 문자: " + b);
		System.out.println("세번째 문자: " + c);
		
		
		
	}

}
