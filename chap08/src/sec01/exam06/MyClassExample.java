package sec01.exam06;

public class MyClassExample {

	public static void main(String[] args) {
		// quiz 어떤 구현 객체가 실행될지 맞추기
		System.out.println("1)------------");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.turnOff(); // 텔레비전
		myClass1.rc.setVolume(5);
		
		System.out.println("2)----------------");
		
		MyClass myClass2 = new MyClass(new Audio()); // 오디오
		
		System.out.println("3)----------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA(); // 오디오
		
		System.out.println("4)----------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television()); // 텔레비전
		
	}

}
