package sec01.exam06.quiz;

import java.io.FileInputStream;
import java.io.InputStream;

public class quiz {

	public static void main(String[] args) {
		byte[] a = new byte[1000];
		try (InputStream os = new FileInputStream("C:/Temp/애국가1.dat"))  {
			int readByteNum = os.read(a);
			String str = new String(a,0,readByteNum); 
			System.out.println(str);
			
		} catch (Exception e) {
			
		}
	}
}
// 바이트를 직접 읽고 수동으로 디코딩 하는 방법은
// 가능은 하지만 인코딩 경계 문제(멀티바이트 문자 잘림 등)가 있어서 복잡하고 위험이 큼
// 가능한 => 문자 기반 스트림 사용
