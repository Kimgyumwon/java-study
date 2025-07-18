package Homewokr02;

import java.util.Scanner;

public class Homewokr03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친구 수 : ");
		int a = sc.nextInt();
		System.out.print("사탕의 수 : ");
		int b = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + b/a + "개");
		System.out.println("남는 사탕 개수 : " + b%a + "개");
		
		
		
	}

}
