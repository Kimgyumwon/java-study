package Homework.Homework04;

public class ExMethodController {
	
	void str(String str1) {
		System.out.println(str1);
	}
	void puls() {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	String isEven(int x) {
		if( x %2 == 0) return "짝수";
		if( x %2 == 1) return "홀수";
		return "양수가 아닙니다";
	}
	boolean hasLetter(String str1) {
		for(int i=0; i<str1.length(); i++ ) {
			if(str1.charAt(i) >= 'a' && str1.charAt(i) <='z') return true;
			if(str1.charAt(i) >= 'A' && str1.charAt(i) <='Z') return true;
		}
		return false;
	}
				
	int countChar(String str1 , char c) {
		int count = 0;
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	void displayGugudan(int x) {
		for(int i=1; i<=9; i++) {
			System.out.println(x + "*" + i +"="+i*x );
		}
	}
	
			
		
	
	
	
	
	
}
