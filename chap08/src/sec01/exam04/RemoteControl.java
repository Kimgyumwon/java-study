package sec01.exam04;
public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10; // public static final이 자동으로 추가됨 
	int MIN_VOLUME = 0;

	// 추상 메소드
	// 추상 메소드라서 실행 블록 없음
	// public abstract 가 자동으로 추가됨
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
