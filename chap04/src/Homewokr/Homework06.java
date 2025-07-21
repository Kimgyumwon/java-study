package Homewokr;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어설계 점수: ");
		int sw = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int swg = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int db = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int program = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int in = sc.nextInt();
		double avg = (sw + swg + db + program + in) / 5.0;
		
		if( sw < 40) {
			System.out.println("소프트웨어설계 과목 과락입니다.");
		}else if( swg < 40) {
			System.out.println("소프트웨어개발 과목 과락입니다.");			
		}else if( db < 40) {
			System.out.println("데이터베이스구축 과목 과락입니다.");			
		}else if( program < 40) {
			System.out.println("프로그래밍언어활용 과목 과락입니다.");			
		}else if( in < 40) {
			System.out.println("정보시스템구축관리 과목 과락입니다.");			
		}else if( avg < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");			
		}else {
			System.out.println("합격을 축하합니다!");
		}
		
		
		
		
		
	}

}
