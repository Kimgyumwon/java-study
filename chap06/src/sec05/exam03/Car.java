package sec05.exam03;

public class Car {
	// 인스턴스 필드
	int speed;
	
	// 인스턴스 메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	// 정적 메소드
	static void test() {
		// 정적 메소드에서는 인스턴스 필드, 인스턴스 메소드, this 키워드 사용 불가
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		//왜 굳이 정적 메소드에서 객체를 만들어서 인스턴스 멤버를 쓰는가?
		//이미 인스턴스 멤버를 사용해야 한다면, 그냥 인스턴스 메소드를 만드는 것이 자연스럽고 명확함
	}
	public static void main(String[] args) {
		test();
	}
	
	
	
}
