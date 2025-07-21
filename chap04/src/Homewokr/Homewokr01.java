package Homewokr;

import java.util.Scanner;

public class Homewokr01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int a = sc.nextInt();
		
		if(a < 3) {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		} else if( a <= 12) {
			System.out.println("당신의 놀이동산 요금은 10000원입니다.");
		}else if( a <= 18) {
			System.out.println("당신의 놀이동산 요금은 20000원입니다.");
		}else if( a <= 64) {
			System.out.println("당신의 놀이동산 요금은 30000원입니다.");
		}else {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		}
		
		
		
		
		
		
		
		
	}

}
