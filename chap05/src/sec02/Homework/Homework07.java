package sec02.Homework;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0;
		while (true) {
			System.out.print("정수 :");
			a = sc.nextInt();
			if( a<=0) System.out.println("양수가 아닙니다.");
			break;
			
	}
		for(int i=1; i<=a; i++) {
			if(i%2 == 1)System.out.print("박");
			if(i%2 == 0)System.out.print("수");
		}
		
}

	
}
