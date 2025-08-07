package sec01.exam12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		// 한 번에 지정한 문자 배열의 크기만큼 읽을 수 있으므로 빠르게 문자 데이터를 읽을 수 있음
		// 길이가 100인 char 타입의 빈 배열 새성
		char[] array = new char[100];
		
		reader.read(array);
		
		String a = new String(array);
		System.out.println(a);
		
		while (true) {
			int readCharNum = reader.read(array);
			if (readCharNum == -1) break;
			
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(array[i]);
			}
			
		}
		reader.close();
		
		
		
		
		
		
	}

}
