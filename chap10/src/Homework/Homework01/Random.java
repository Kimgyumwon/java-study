package Homework.Homework01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random =  (int)(Math.random()*50+1); //1~50 까지의 랜덤한 숫자
		int count = 0;
		
			
		while(true) {
			
			//1~50까지의 랜덤한 숫자 맞추기
			System.out.print("1~50사이의 숫자 : ");
			try {
			int user = sc.nextInt();
			if(user > random) {
				System.out.println("Down!");
			}else if(user < random) {
				System.out.println("up");
			}else {
				System.out.println("축하합니다~ 정답이에요 총 시도 횟수: " + count);
				return;
			}
			count++;
	
			}
		catch(InputMismatchException e) {
			System.out.println("잘못된 값입니다. 숫자를 입력해주세요");
			sc.nextLine();
		}
		}
			
		
			
			
		
		
		
		
		
		
		
		
	}

}
