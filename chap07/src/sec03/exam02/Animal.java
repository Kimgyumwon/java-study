package sec03.exam02;
// 이 예제에서는 공통 기능 제공 + 하위 클래스가 나머지를 구현하도록 강제
public abstract class Animal {
	public String kind;
	// 모든 동물은 숨을 쉰다. (공통 기능)
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	// 추상 메소드 (동물 각자 울음 소리가 다름)
	// 미완성 메소드, 실행부(몸통,{}) 가 없는 메소드
	// 꼭 필요하지만 자식마다 다르게 구현될 것으로 예상되는 경우
	// 동일한 이름으로 구현을 강제하는 효과
	public abstract void sound();
	
	
}
