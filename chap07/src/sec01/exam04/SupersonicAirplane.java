package sec01.exam04;
// 비행기의 일반적인 특성을 물려받고 초음속 비행 기능만 추가
public class SupersonicAirplane extends Airplane{
	// 비행모드를 상수로 선언
	public static final int NORMAL =1;
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();
			// 주로 부모 메소드의 기능을 일부 유지하면서, 자식에서 확장하려 할 때 사용
		}
	}
}
