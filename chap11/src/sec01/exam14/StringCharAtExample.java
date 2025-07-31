package sec01.exam14;
public class StringCharAtExample {
	public static void main(String[] args) {
		// 주민등록 번호 남자 여자 구분
		String ssn = "123456-1235648";
		char gender = ssn.charAt(7); // 문자열에서 특정 인덱스의 문자 추출
		switch (gender) {
			case '1': System.out.println("남자"); break;
			case '2': System.out.println("여자"); break;
			case '3': System.out.println("남자"); break;
			case '4': System.out.println("여자"); break;
		}
	}
}
