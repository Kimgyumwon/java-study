package quiz;

import java.util.Scanner;

//Quiz
//실행 클래스의 deleteChar 메소드를 구현하시오
//deleteChar(원본문자열, 삭제문자열) 메소드는 원본 문자열에서 삭제 문자열에 속한 문자를 제거하고 
//남는 문자열을 리턴하는 메소드입니다.
//※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
//
//[입력]
//1) 1,2-3 ,-!
//2) 1a2b3 12345
//
//[출력]
//1) 123
//2) ab

public class quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String delete  = sc.nextLine();
		String str1 = sc.nextLine();
		String newStr = deleteChar(str1,delete );
		System.out.println(newStr);
		
		String delete2 = sc.nextLine();
		String str2 = sc.nextLine();
		String newStr2 = deleteChar(str2, delete2);
		System.out.println(newStr2);
		
	}

	public static String deleteChar(String str1 , String delete) {
		String newStr = "";
		for (int i =0; i<str1.length(); i++) {
			if (delete.indexOf(str1.charAt(i)) == -1) {
				newStr += str1.charAt(i);
			} else {
				
			}
				
			
			
		}
		return newStr;
		
	}
		
		
		
}
	

