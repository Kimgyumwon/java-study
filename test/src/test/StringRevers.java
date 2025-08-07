package test;

public class StringRevers {

	public static void main(String[] args) {
		
		String str = "abcde";
		String strRevers = "";
		for (int i = str.length()-1; i >= 0; i--) {
			strRevers += str.charAt(i);
			
		}
		System.out.println("원본 문자열: " + str);
		System.out.println("뒤집힌 문자열: " + strRevers);
		
	}

}
