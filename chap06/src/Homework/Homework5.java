package Homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		String[] choices = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		while(true) {
			int ran = (int)(Math.random()*3);
			String my = sc.nextLine(); // 사용자 가위바위보
			if("stop".equals(my)) break; //사용자가 stop을 입력하면 프로그램 종료
			System.out.println(choices[ran]); //컴퓨터가 랜덤으로 가위바위보
			
			
		
			
			
		}

		
		
	}

}
