package test;

import java.util.Scanner;

public class findRemainderOneNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세요: ");
		int n = sc.nextInt();
		int count = 1;
		
		
		
		while ( true ) {
			if ( n % count == 1) {
				break;
			}
			count++;
		}
		
		System.out.println("나머지가 1이 되는 수: " + count);
		
		
		
		
		
	}

}
