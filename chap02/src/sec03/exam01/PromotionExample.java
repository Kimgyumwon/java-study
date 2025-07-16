package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10; // 범위 크기 순서 byte < short < int < long < float < double // char 타입은 int 타입 형변환 시 유니코드 출력  
		int intValue = byteValue; // 1byte -> 4byte, 자동 형변환		
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; // 2byte -> 4byte, 자동 형변환
		System.out.println("intValue: " + intValue); // 유니코드 값 출력

		intValue = 30;
		long longValue = intValue; // 4byte -> 8byte, 자동 형변환
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // 실제 저장되는 값의 범위는 long < float
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue; // 4byte -> 8byte, 자동 형변환
		System.out.println("doubleValue: " + doubleValue);
		
		// byte -> char로 자동 형변환 불가
//		byte byteVal = 65;
//		char charVal = byteVal; // char는 음수를 포함하지 않는데 byte 타입은 음수를 포함
	}

}
