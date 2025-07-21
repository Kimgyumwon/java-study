package Homewokr02;

import java.util.Scanner;

public class Homewokr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		String str = sc.nextLine();
		// 변수 쪽에 equals()를 호출하면, str이 null일 경우 예외가 발생할 수 있음
		
//		String str1 =str.equals("간다") ? "온다" : "간다";
		String str1 = "간다".equals(str) ? "온다" : "간다" ;
		// 리터럴이나 상수를 앞에 두면, str이 null이어도 안전하게 비교 가능 (null-safe)
		
		
		
		System.out.println("앵무새 : " + str1);
		
	}

}
