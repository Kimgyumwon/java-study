package HomeWork;

import java.util.Scanner;

public class HomeWokr6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("한 자리 숫자를 입력하세요 : ");
		char a = sc.nextLine().charAt(0);
		int b = a-'0';
		System.out.println("입력한 숫자의 제곱은: " + b*b);
		
	}

}
