package HomeWork;


import java.util.Scanner;

public class HomeWokr4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		char code = sc.nextLine().charAt(0);
		int unicode = code;
		System.out.println(code + "의 유니코드 : " + unicode);
		
	}

}
