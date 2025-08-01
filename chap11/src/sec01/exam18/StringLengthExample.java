package sec01.exam18;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "1234567890123";
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println(length);
		} else {
			System.out.println("다시입력");
		}
		
	}

}
