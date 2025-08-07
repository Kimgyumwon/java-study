package test;

import java.util.Scanner;

public class SumOfDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("약수의 합을 구할 수를 입력해주세요: ");
		int n = sc.nextInt();
		int count = 1;
		int sum = 0;
		while (true) {
			if ( n % count == 0 ) {
				sum += count;
			}
			if (n == count) break;
			count++;
			
			
		}
			
		System.out.println(n+"약수의 합: "+sum);
		
		
		
		
	}

}
