package sec01.exam13.quiz;

import java.io.FileReader;
import java.io.Reader;

public class Quiz1 {

	public static void main(String[] args) {
		
		
		char[] c = new char[100];
		try (Reader reader = new FileReader("C:/Temp/output.txt")) {
			
			while (true) {
				int a = reader.read(c);
				if( a == -1) break;
				String str = new String(c,0,a);
				System.out.println(str);
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
