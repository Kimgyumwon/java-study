package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {
		// 테스트
		Parent par= new Parent();
//		Child child = (Child)par; // ClassCast Exception
		
		//강제 타입 변환 하기 전에 검사(안전한 코딩)
		// 검사할 객체 instanceof 연산자 클래스 타입
		if(par instanceof Child) {
			// par 변수가 참조하는 객체가 Child 타입의 인스턴스인지
			// Child 타입으로 부터 만들어졌는지
			Child child = (Child)par;
			System.out.println("강제 타입 변환 성공");
		} else System.out.println("강제 타입 변환 실패");
		Parent par1 = new Child();
		method1(par1);
		
		
		
	}
	private static void method1(Parent par1) {
		
		// 자바 12부터 추가된 문법
		// instanceof 결과가 true일 경우 자동 타입 변환되어 변수에 대입 
		if (par1 instanceof Child child ) {
//		if (par1 instanceof Child) {
//			Child child = (Child)par1;
			System.out.println("Child로 변환성공");
		}else System.out.println("Child로 변환되지 않음");
			
		
	}
	// Quiz: instanceof를 사용하여 안전하게 Child 타입으로 변환하기
	// 변환 성공 시 "Child로 변환 성공"
	// 변환 실패 시 "Child로 변환되지 않음"
	
}
