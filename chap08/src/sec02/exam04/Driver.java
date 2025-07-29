package sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		// 버스일 때는 승차요금 확인 필요
		if(vehicle instanceof Bus bus) {// ~의 인스턴스가 맞는지? (~로부터 만들어졌는지)
			// 안전하게 검사 후 강제 타입 변환
			bus.checkFare();
		}
		vehicle.run();
		
		
	}
}
