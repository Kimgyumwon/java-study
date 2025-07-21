package Homewokr;

import java.util.Scanner;

public class Homewokr02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temperature = sc.nextInt();
		String season = null;
		if ( month < 1 || month > 12 ) {
			System.out.println("해당하는 계절이 없습니다.");
			return;
		}
		if ( month >= 3 && month <=5) {
			season = "봄";
		} else if ( month >=6 && month <=8) {
			season = "여름";
		}
			if(temperature >= 35) {
				season += " 폭염 경보";
			} else if(temperature >= 33) {
				season += " 폭염 주의보";
			}
			if ( month >= 9 && month <=11) {
				season = "가을";
			} else if ( month >=12 || month <=2) {
				season = "겨울";
			}
				if(temperature <= -15) {
					season += " 한파 경보";
				} else if(temperature <= -12) {
					season += " 한파 주의보";
				}

		System.out.println(season);
		
			
			
			
		
		
	}

}
