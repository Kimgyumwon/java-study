package test;

import java.util.Scanner;

public class NumList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력: ");
		int[] list = new int[sc.nextInt()];
		
		for (int i = 0; i < list.length; i++) {
			System.out.print("배열에 들어갈 수를 입력 : ");
			list[i] = sc.nextInt();
		}
		
		
		int a = 0;
		int b = 0;
		for (int i = 0; i < list.length; i++) {
			if ( list[i]%2 == 0 ) {
				a++;
			} else {
				b++;
			}
		}
			
		System.out.println("짝수의 개수: " + a + "\t홀수의 개수: " + b);
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
