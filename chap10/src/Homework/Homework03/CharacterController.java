package Homework.Homework03;

public class CharacterController {
	
	public CharacterController() {
		
	}
	public void countAlpha(String s) throws CharCheckException{
		System.out.println("문자열 : " + s);
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if('a'<=s.charAt(i) && 'z' >= s.charAt(i)) {
				count++;
			}else if('A'<=s.charAt(i) && 'Z' >= s.charAt(i) ) {
				count++;
			}
		}
		System.out.println("'"+ s+"'" + "에 포함된 영문자 개수 : " + count );
		}
		
		
		
		
		
	}

