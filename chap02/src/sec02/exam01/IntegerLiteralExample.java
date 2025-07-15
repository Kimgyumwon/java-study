package sec02.exam01;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		// int(4byte)
		int val1 = 0b1011; //2진수( 하드웨어 제어 프로그램 시 사용)
		int val2 = 013; //8진수
		int val3 = 11; //10진수
		int val4 = 0xB3; //16진수( RGB 색상값 저장 시)
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
	}

}
