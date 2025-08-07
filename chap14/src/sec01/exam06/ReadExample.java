package sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		byte[] buffer = new byte[5];
		
		
		try (InputStream os = new FileInputStream("C:/Temp/test3.db");) {
			int readByteNum = os.read(buffer,2,3);
			if (readByteNum != -1 ) { // 읽은 바이트가 있다면
				for (int i = 0; i < buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
					
			
			
		} catch (Exception e) {
		
		}
		

		
		
		
		
		
		
	}

}
