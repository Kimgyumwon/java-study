package sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		// 데이터 출발지를 test.db 파일로 하는 바이트 기반 파일 입력 스트림 생성
		int a = 0;
		try(InputStream os = new FileInputStream("C:/Temp/test.db")) {
			while( true ) {
				a = os.read();
				if ( a == -1) break;
				System.out.println(a);
			}
				
		} catch (Exception e) {
			
		}
	}

}
