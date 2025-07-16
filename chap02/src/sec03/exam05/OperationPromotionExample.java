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
		
		
		
		
		
	}

}
