package testcode01;

import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		int a;  // random  1 < a*100 < 101
		int b = 0;
		a = (int)(Math.random()*100+1);
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요(1~100)");
		b = sc.nextInt();		
		while(true) {
			if(a>b) {
				System.out.print("숫자를 입력하세요(1~100)");
				b = sc.nextInt();
				System.out.println("숫자가 큽니다"); 
			}
			if(a<b) {
				System.out.println("숫자가 작습니다");
				System.out.print("숫자를 입력하세요(1~100)");
				b = sc.nextInt();
			}
			if ( a== b) break;
		}
			
		
		
	}
}