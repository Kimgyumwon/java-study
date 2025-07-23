package Homework.Homework04;

public class ExMethodControllerMain {

	public static void main(String[] args) {
		ExMethodController method = new ExMethodController();
		method.str("아아아");
		method.puls();
		String even = method.isEven(6);
		boolean letter = method.hasLetter("12a");
		int count = method.countChar("apple", 'p');
		method.displayGugudan(3);
		System.out.println(even);
		System.out.println(letter);
		System.out.println(count);
		
	}

}
