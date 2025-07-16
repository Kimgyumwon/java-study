package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		// 기본 전제: 두 개의 값 중 크기가 큰 타입으로 자동 형변환 된다.
		// 크기가 작은 타입으로 자동 형변환이 안될뿐더러 값의 손실도 일어날 수 있다.
		
		// 산술 연산에서 int 타입 이하일 경우에는 int로 자동 형변환
		byte x = 10;
		byte y = 20;
		int result = x + y; // 연산 시 우선적으로 byte가 int로 변환됨, int + int
		byte result1 = (byte)(x + y);
		System.out.println("int: " + result);
		System.out.println("byte: " + result1);
	}

}
