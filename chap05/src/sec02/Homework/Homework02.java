package sec02.Homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			if(num < 0) {System.out.println("양수만 입력해주세요."); continue;}
			if(num > 9) {System.out.println("9이하의 숫자를 입력해주세요"); continue;}
			if(num == 0) {System.out.println("프로그램을 종료합니다."); break;}
			else {	System.out.println("====="+num+"단=====");
				for(int i=1; i<10; i++) {
					System.out.println(num +"*"+i+"="+num*i);
				}
					
			}
			
		}
		
		
	}

}
