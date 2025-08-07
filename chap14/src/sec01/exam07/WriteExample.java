package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		// 데이터 도착지를 test7.txt 파일로 하는 문자 기반 파일 출력 스트림 생성
		try(Writer writer = new FileWriter("C:/Temp/test7.txt")) {
//			char a = 'A';// 각 1바이트씩
//			char b = 'B';
//			char c = 'C';
			// 3바이트로 저장됨
			
//			char a = '가'; // 각 3바이트씩
//			char b = '나';
//			char c = '다';
			// 9바이트로 저장됨
			// 문자-> 바이트 변환시 자동 인코딩
			
						
			String a = "가나다라";
			// 한 문자씩 세번 출력
			writer.write(a);
//			writer.write(b);
//			writer.write(c);
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
		
		
		
	}
}