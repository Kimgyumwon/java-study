package Homework.Homework03;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요: ");
		String email = sc.nextLine().trim();
		int index = email.indexOf("@");
		if (email.substring(index+1).equals("goodee.co.kr")) {
			System.out.println(email.substring(0, index).toUpperCase());
		} else {
			System.out.println("유효하지 않은 이메일입니다. ");
		}
		
		
	}

}
