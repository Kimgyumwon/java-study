package sec04.exam03;

import java.io.IOException;

public class ContinueKeycodeExample {

	public static void main(String[] args) throws Exception {
		int keycode;
		
		while (true) {
			keycode = System.in.read();
			System.out.println("keycode: " + keycode);
		}
		
		
	}

	
}
