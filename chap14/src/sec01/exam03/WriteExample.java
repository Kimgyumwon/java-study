package sec01.exam03;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class WriteExample {
	public static void main(String[] args) {
		byte[] array = {65,66,67,68,69};
		try (OutputStream os = new FileOutputStream("C:/Temp/test3.db")) {
			// 바이트 데이터를 배열로 출력 시 출력 범위를 지정 가능
			os.write(array,1,3);
		} catch (Exception e) {
			
		}
	}

}
