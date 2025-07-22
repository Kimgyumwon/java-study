package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		// 클래스 외부(다른 클래스)에서의 필드사용
		// => 객체를 생성한 뒤 해당 객체에 접근하여 사용 
		// 필드는 객체의 데이터이기 때문에 객체 없이는 쓸 수 없음
		
		// 객체 생성
		Car myCar = new Car(); // new 연산자 + 생성자 호출
		
		//필드 값 읽기
		System.out.println("제작회사: " + myCar.company); // 도트 연산자, 객체 접근 연산자
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("maxSpeed: " + myCar.maxSpeed);
		System.out.println("speed: " + myCar.speed);

		// 필드 값 변경
		myCar.speed = 60;
		System.out.println("speed: " + myCar.speed);
		
	}
	
}
