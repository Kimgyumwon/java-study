package Homework.Homework02;

public class Practice {
	
	public String takeState(String data) {
		// 문자열을 잘라서 배열에 넣음
		String[]	 split = data.split(" ");
		
		// 문자열 마지막에 "구"가 있는지 확인
		for(String word : split) {
			if ( word.indexOf("구") == word.length()-1 && word.indexOf("구") != -1) {return word;}
		}
		
		return null;
		
		
	}
}