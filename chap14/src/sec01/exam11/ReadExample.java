package sec01.exam11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		
		Reader reader = new FileReader("C:/Temp/test7.txt");
		
		while (true) {
			// 입력 스트림으로부터 한 문자(2byte)씩 읽어오고
			// int(4byte) 타입으로 리턴
			int a =reader.read();
			if (a == -1) break;
			
			char b= (char)a;
			System.out.print(b);
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
