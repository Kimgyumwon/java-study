package sec04.exam04;

import java.io.IOException;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keycode;
		
		while(true) {
			keycode = System.in.read();
			System.out.println("keycode: " + keycode);
			// 소문자 q를 입력하면 종료되도록 만들기
			if (keycode==113) break; // keycode가 113과 동일한 경우 반복문 탈출
			
		}
		
		System.out.println("종료되었습니다.");
		
	}

}
