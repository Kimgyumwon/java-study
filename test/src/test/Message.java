package test;

public class Message {

	public static void main(String[] args) {
		String message = "happy birthday!";
		int result = 0 ;
		
		for (int i = 0; i < message.length(); i++) {
			result += 2;
		}
		
		System.out.println(result);	
		
		
	}

}
