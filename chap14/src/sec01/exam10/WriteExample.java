package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		
		try (Writer writer = new FileWriter("C:/Temp/test10.txt")) {
			
			String str = "안녕하세요.......";
			
			// 문자열 전체 출력
//			writer.write(str);
			
			// 특정 인덱스 부터 출력
			writer.write(str, 3, 5);
			
			
			
		} catch (Exception e) {
			
		}
		
	}

}
