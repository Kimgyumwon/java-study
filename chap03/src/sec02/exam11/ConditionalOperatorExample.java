package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorExample {

	public static void main(String[] args) {

		int score = 85;
		
		char grade1 = score > 90 ? 'A' : 'B';
		System.out.println(grade1);
		
		char grade = score > 90 ? 'A' : score > 80 ? 'B' : score>70 ? 'C' : 'F';
		System.out.println(grade);
		
		char grade2 = score > 90 || score < 80 ? 'L' : 'H';
		System.out.println(grade2);
		
		// Quiz
		//0~100사이의 점수를 입력받아
		//점수가 60점 이상이면 "합격"
		//60점 미만인 경우 "불합격"응ㄹ 출력하는 프로그램 구현
		// 단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score1 = sc.nextInt();
		//String str1 = score1 > 100 ? "점수입력오류" : score1 < /0 ? "점수입력오류" : score1 >= 60 ? "합격" : "불합격";
		String str1 = (score1 < 0 || score1 > 100) ? "점수입력오류" : score1 >= 60 ? "합격" : "불합격";
		System.out.println(str1);
		
	}

}