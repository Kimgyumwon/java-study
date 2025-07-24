package sec06.exam05.package1;

public class B {
	
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; private 로 선언된 필드 , 메소드는 사용 불가
		a.method1();
		a.method2();
//		a.method3();
	}
	
	
	
	
	
}
