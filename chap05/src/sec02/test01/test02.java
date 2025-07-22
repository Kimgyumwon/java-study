package sec02.test01;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		double avg = 0;
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 >");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {System.out.print("학생수>"); studentNum = sc.nextInt();}
			else if(selectNo == 2) {
				scores = new int[studentNum];
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]>");
						scores[i] = sc.nextInt();
					}
			}
			else if(selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			}
			else if(selectNo == 4) {
				for(int i = 1; i< scores.length; i++) {
					if(scores[i-1]<=scores[i]) max = scores[i]; 		
				}
				for (int j = 0; j < scores.length; j++) {
					sum += scores[j];
				}
				avg = (double)sum/scores.length;
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
			}
			else if(selectNo == 5) break; 
			
		}
		System.out.println("프로그램 종료");
		
		
	}

}
