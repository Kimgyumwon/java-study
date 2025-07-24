package sec05.exam04;

public class Singleton {
	// step2
	private static final Singleton singleton = new Singleton();
	// private 으로 외부에서 변경 못하게 막기
	// => 단 하나의 객체만 만들어 사용 하기 위해
	
	// step 1
	private Singleton() {} // private : 비공개, 외부에서 new 연산자로 호출불가
//	Singleton () {} 외부에서 호출가능 -> 여러 개의 객체 생성 가능

	
	//step 3
	public static Singleton getInstance() { //싱글톤 객체를 반환하는 메소드 이름은 관례적
		//자기 자신의 객체를 리턴
		return singleton;
	}
	
	
}
