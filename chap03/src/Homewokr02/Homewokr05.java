package Homewokr02;

import java.util.Scanner;

public class Homewokr05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주문번호(-) : ");
		char str = sc.nextLine().charAt(7);
		
		String str1 = (str == '1' || str == '3') ? 
				"입력하신 주민번호는 남성입니다." : (str == '2' || str == '4') ?
						"입력하신 주민번호는 여성입니다." : "입력하신 주민번호는 잘못된 값입니다.";
		System.out.println(str1);
		
	}

}
