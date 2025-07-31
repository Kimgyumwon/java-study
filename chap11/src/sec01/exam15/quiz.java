package sec01.exam15;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine();
		int sum = 0;
		for(int i =0; i < str.length(); i++) {
			if ( str.charAt(i) >= '0' && str.charAt(i) <= '9' ) {
				sum += str.charAt(i)-'0';
			}
			
		}
		System.out.println("합계 : " + sum);
		
		// 자바에서 제공하는 메소드 이용
		int sum2 =0;
		// 문자열을 char 배열로 변환하는 메소드
		for (char ch :str.toCharArray()) {
			//문자가 숫자인지 판별하는 메소드
			if(Character.isDigit(ch)) {
				//문자를 숫자로 바꿔주는 메소드
				sum2 += Character.getNumericValue(ch);
			}
		}
		
		System.out.println("합계2 : " +sum2);
		
		
		
	}

}
