package sec02.Homework;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn;
		
		while(true) {
			int sum = 0;
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
				for(int i=0; i<str.length();i++) {
					if(ch == str.charAt(i)) sum++;
				}
			System.out.println("포함된 개수 : " + sum);
			while(true) {
				System.out.print("다시 입력하시겠습니까: ");
				yn = sc.nextLine();
				if("n".equalsIgnoreCase(yn)) {
					System.out.println("프로그램 종료");
				}else if("y".equalsIgnoreCase(yn)) {
					break;
				}else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}
			
			
			}
		
	}

}
