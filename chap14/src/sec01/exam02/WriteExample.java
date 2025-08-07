package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		// 데이터 도착지를 test2.db파일로 하는 바이트 기반 파일 출력 스트림 생성
		byte[] out = {97,65,98};
		
		try(OutputStream os = new FileOutputStream("C:/Temp/test2.db");) {
			os.write(out);
			os.flush();
		} catch (Exception e) {
			
		}
		
		
		
		
	}

}
