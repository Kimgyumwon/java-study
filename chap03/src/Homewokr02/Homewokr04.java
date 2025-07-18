package Homewokr02;

import java.util.Scanner;

public class Homewokr04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int k = sc.nextInt();
		System.out.print("수학 : ");
		int m = sc.nextInt();
		System.out.print("영어 : ");
		int e = sc.nextInt();
		
		int total = k + m + e;
		int avg = (k+m+e)/3;
		
		String str = (k >= 60 && m >= 60 && e >= 60 && avg >=90 ) ? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다.";
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
		System.out.println(str);
		
		
		
	}

}
