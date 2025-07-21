package Homewokr;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a > 5) {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		}else if( a == 1) {
			System.out.println("스쿼트 운동 시간입니다");
		}else if( a == 2) {
			System.out.println("데드리프트 운동 시간입니다.");
		}else if( a == 3) {
			System.out.println("벤치 프레스 운동 시간입니다.");
		}else if( a == 4) {
			System.out.println("풀업 운동 시간입니다");
		}else if( a == 5) {
			System.out.println("오늘도 수고하셨습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
