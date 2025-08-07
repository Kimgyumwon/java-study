package test;

import java.util.Scanner;

public class PerfectSquareChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(true) {
			if (Math.pow(count,2) == n) {
				System.out.println( (int)Math.pow(count+1, 2));
				return;
			}
			if ( count == n) {
				System.out.println("제곱근이 없습니다.");
				return;
			}
			count++;
			
		}
		
		
		
	}

}
