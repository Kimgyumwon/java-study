package sec02.Homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		do {
			System.out.print("숫자(0을 입력하면 종료) :");
			num = sc.nextInt();
		if(num < 0) continue;
			sum += num;
			
		} while (num != 0);
			System.out.println("양수의 합계 :" + sum);
		
		
		
		
	}

}
