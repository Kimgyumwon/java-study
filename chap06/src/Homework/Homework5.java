package Homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		String[] choices = {"가위", "바위", "보"};
		int count = 0 ;
		int countWin = 0;
		int countd = 0;
		int countlose =0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			int ran = (int)(Math.random()*3);
			System.out.print("가위바위보: ");
			String my = sc.nextLine(); // 사용자 가위바위보
			if("stop".equals(my)) break; //사용자가 stop을 입력하면 프로그램 종료
			System.out.println(choices[ran]); //컴퓨터가 랜덤으로 가위바위보
			//무승부
			if(my.equals(choices[ran])) {System.out.println("비겼습니다"); count++; countd++;}
			
			//가위
			if(my.equals("가위")) {
				if(choices[ran].equals("보")) {
					System.out.println("이겼습니다");
					countWin++; count++;
				}
				if(choices[ran].equals("바위")) {
					System.out.println("졌습니다");
					countlose++; count++;
				}
			}
			//바위
			if(my.equals("바위")) {
				if(choices[ran].equals("가위")) {
					System.out.println("이겼습니다");
					countWin++; count++;
				}
				if(choices[ran].equals("보")) {
					System.out.println("졌습니다");
					countlose++; count++;
				}
			}
			//보
			if(my.equals("보")) {
				if(choices[ran].equals("바위")) {
					System.out.println("이겼습니다");
					countWin++; count++;
				}
				if(choices[ran].equals("가위")) {
					System.out.println("졌습니다");
					countlose++; count++;
				}
			}else {
				System.out.println("잘못입력했습니다");
			}
			
			
			
			
		}
		System.out.println(count + "전" + countWin + "승" +countd + "무" + countlose +"패");
		
		
	}

}
