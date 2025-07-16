package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1= 10;
		byte byteValue2= 20;
		int intValue = byteValue1 + byteValue2;
		System.out.println("byte 연산을 int로 변환: " + intValue);
		
		// char도 마찬가지로 연산 시 int로 형변환
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue1 = charValue1 + charValue2;
		System.out.println("char 연산을 int로 변환: " + intValue1);
		System.out.println("유니코드: " + (char)intValue1);
		
		// 정수 / 정수 = 정수
		int intValue3= 10;
		int intValue4= intValue3 / 4; // 정수 연산의 결과는 정수, 10 / 4 = 2
		System.out.println(intValue4);
		
		double doubleValue1 = intValue3 / 4;
		System.out.println(doubleValue1);
		
//		실수 결과를 얻으려면
		double doubleValue2 = (double)intValue3 / 4.0;
		System.out.println(doubleValue2);
		
		int x = 1;
		int y = 2;
		double result = (double)x / y;
		System.out.println(result);
		
		//Quiz
//		아래의 변수들을 선언, 초기화하세요.
//		두 수를 더한 값을 출력하는 프로그램을 구성하세요.
//		1. 정수형 변수 num1에 10 할당
//		2. 실수형 변수 num2에 5.7 할당
		
//		결과 정수: 15 실수: 15.7
		int num1 = 10;
		double num2 = 5.7;
		int num3 = num1 + (int)num2;
		double num4 = num1 + num2;
		System.out.println("정수결과: " + num3);
		System.out.println("실수결과: " + num4);
		
		System.out.println( "정수결과: " + (int)(num1+num2) );
		System.out.println( "실수결과: " + (double)(num1+num2) );
	}

}
