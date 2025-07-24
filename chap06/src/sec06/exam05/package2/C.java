package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {

	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;				// private , default 로 선언된 필드 , 메소드는 다른 패키지에서 사용 불가
//		a.field3 = 1;
		a.method1();
//		a.method2();
//		a.method3();
	}
	
	
	
	
	
	
	
	
	
	

}