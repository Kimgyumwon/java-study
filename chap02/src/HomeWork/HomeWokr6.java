package HomeWork;

import java.util.Scanner;

public class HomeWokr6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("한 자리 숫자를 입력하세요 : ");
		char a = sc.nextLine().charAt(0);
		//char 타입의 숫자형 문자를 정수로 변환하여 계산
		int b = a-'0'; // 연산 시 자동 형변환(char -> int) 발생
		System.out.println("입력한 숫자의 제곱은: " + b*b + "입니다.");
		
	}

}
