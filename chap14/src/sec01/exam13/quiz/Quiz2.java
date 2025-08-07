package sec01.exam13.quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Quiz2 {
	public static void main(String[] args) throws IOException {
		
		Reader reader = new FileReader("C:/Temp/test.txt");

		char[] read = new char[100];
		
		int readNum = reader.read(read);
		
		System.out.println(read);
		
		reader.close();
		
		Writer writer = new FileWriter("C:/Temp/test_copy.txt");
		
		writer.write(read);
		
		writer.flush();
		writer.close();
		
		
		
	}
}
