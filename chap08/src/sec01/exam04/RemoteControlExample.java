package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {

		
		// 인터페이스 타입에 구현 객체들을 담을 수 있다.
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(-2);
		rc.turnOff();
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		//정리 : 메소드 호출 코드는 똑같은데 어떤 구현 객체가 대입되었냐에 따라 실행 결과는 달라짐 => 다형성
	}

}
