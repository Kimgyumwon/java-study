package sec01.exam26;

import java.util.Scanner;

public class MathExample {

	public static void main(String[] args) {
		//절대값
		int v1 = Math.abs(-2);
		double v2 = Math.abs(-3.14);
		// 올림
		double v3 = Math.ceil(5.3); // 천장
		double v4 = Math.ceil(-5.3); 
		System.out.println(v3);
		System.out.println(v4);
		// 내림
		double v5 = Math.floor(5.3); // 천장
		double v6 = Math.floor(-5.3); 
		System.out.println(v5);
		System.out.println(v6);
		//최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println(v7);
		System.out.println(v8);
		//최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println(v9);
		System.out.println(v10);
		
		// 랜덤값
		double v11 = Math.random(); // 0.0<= random <1.0
		System.out.println(v11);
		
		// 가까운 정수의 실수값
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println(v12);
		System.out.println(v13);
		
		// 반올림
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println(v14);
		System.out.println(v15);
		
		// 거듭제곱
//		System.out.println(Math.pow(10, 10000000));
		
		//소수점 이하 특정 자리에서 반올림하기
		// quiz : 사용자에게 몇째 자리에서 반올림 할지 입력받아 처리
		double value = 12.3456;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double value1 = Math.round(value* Math.pow(10, a-1) ) / ( Math.pow(10, a-1) ) ;
		
		System.out.println("value1 : " + value1);
		
		
		
		
		
		
		
		
		
		
	}

}
