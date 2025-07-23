package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator mycalc = new Calculator(); // 기본 생성자
		mycalc.powerOn();
		
		int result1 = mycalc.plus(5,6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		
		double result2 = mycalc.divide(x, y); // byte -> int로 자동형변환
		System.out.println("result2: " + result2);
		
//		double result = mycalc.divide(10.5,20.0); 잘못된 매개값 사용
		
		mycalc.powerOff();
		
		
	}

}
