package sec01.exam25;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		Integer value1 = 300;
		Integer value2 = 300;
		
		System.out.println(value1==value2);
		System.out.println(value1.intValue() == value2.intValue());
		System.out.println(value1.equals(value2));
		
		// 예외: 범위값 안에 들어갈 경우 하나의 Integer 객체를 공유한다
//		-128~127
		Integer value3 = 10;
		Integer value4 = 10;
		System.out.println(value3==value4);
		System.out.println(value3.intValue() == value4.intValue());
		System.out.println(value3.equals(value4));
		//굳이 예외 범위를 알고 있을 필요 없이 내부의 값을 비교할 때는 무조건 equals() 메소드 사용
		
		
	}

}
