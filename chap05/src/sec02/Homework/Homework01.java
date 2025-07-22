package sec02.Homework;

import java.util.Scanner;

import javax.swing.text.DefaultTextUI;

public class Homework01 {
 
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수(1~50): ");
			int num = sc.nextInt();
			if(num <= 0 || num > 50) {
				System.out.println("1~50사이의 정수를 입력하세요.");
				continue;}
			
			
			if(num > 0 && num <=50) {
				for(int i=1; i<=num; i++) {
					if(i%2 == 0) sum += i;
					
				}
					
			}
			break;
		}
			System.out.println("짝수의 합계:"+sum);
		
		
	}
}