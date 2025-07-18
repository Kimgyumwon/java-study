package Homewokr02;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구술의 개수 : ");
		int a = sc.nextInt();
		
		String str = (a % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println("구슬의 개수는 "+str+"입니다.");
		
		
	}

}
