package sec04.exam02;

import java.io.IOException;

public class KeycodeExample {

	public static void main(String[] args) throws Exception { // 발생한 예외를 모니터(콘솔)에 출력하고 끝내라
		int keycode;
		
		// 키보드로부터 키코드를 읽어올 때 발생할 수 있음 -> 예외처리
		keycode = System.in.read(); //콘솔에서 키보드로부터 입력을 받을 때까지 기다림(입력이 없으면 멈춰있음)
				System.out.println("keycode: " + keycode);
				
				keycode = System.in.read(); //콘솔에서 키보드로부터 입력을 받을 때까지 기다림(입력이 없으면 멈춰있음)
				System.out.println("keycode: " + keycode);
				keycode = System.in.read(); //콘솔에서 키보드로부터 입력을 받을 때까지 기다림(입력이 없으면 멈춰있음)
				System.out.println("keycode: " + keycode);
				keycode = System.in.read(); //콘솔에서 키보드로부터 입력을 받을 때까지 기다림(입력이 없으면 멈춰있음)
				System.out.println("keycode: " + keycode);
	}

}
