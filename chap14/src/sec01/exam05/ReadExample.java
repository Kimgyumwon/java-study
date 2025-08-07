package sec01.exam05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		InputStream os = new FileInputStream("C:/Temp/test2.db");
		// 한 번에 지정한 배열 크기만큼 바이트 데이터를 읽어 들이므로 훨씬 빠르게 읽어들일 수 있음
		byte[] buffer = new byte[100];
		
		while ( true ) {
			int a =	os.read(buffer);
			if ( a == -1) break;
			
			for (int i = 0; i < a; i++) {
				System.out.println(buffer[i]);
			}
			
			
		}
		os.close();
		
		
		
		
		
		
	
	}
}
