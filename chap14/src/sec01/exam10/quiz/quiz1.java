package sec01.exam10.quiz;

import java.io.FileWriter;
import java.io.Writer;

public class quiz1 {

	
	public static void main(String[] args) {
		
		try (Writer writer = new FileWriter("C:/Temp/output.txt")) {
			String[] lines = {"첫 번째 줄입니다.\n", "두 번째 줄입니다.\n", "세 번째 줄입니다."};
			for (int i = 0; i < lines.length; i++)writer.write(lines[i]);
		} catch (Exception e) {
		}

	}

	
}
