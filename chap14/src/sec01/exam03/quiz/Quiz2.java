package sec01.exam03.quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Quiz2 {

	public static void main(String[] args) {
		
		String str = "\n남산위에 저 소나무 철갑을 두른듯"
					+ "\n바람서리 불변함은 우리기상 일세"
					+ "\n무궁화 삼천리 화려강산 "
					+ "\n대한사람 대한으로 길이보전하세";
		byte[] strByte = str.getBytes(); // 인코딩
		try (OutputStream os = new FileOutputStream("C:/Temp/애국가1.dat",true);){
			os.write(strByte);
		} catch (Exception e) {
		}
		
	}

}
