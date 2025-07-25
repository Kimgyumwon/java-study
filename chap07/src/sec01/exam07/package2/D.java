package sec01.exam07.package2;

import sec01.exam07.package1.A;

public class D extends A{

	
//	A a=new A();
//	a.field = "value";
//	a.method();

	public D() {
		super();
		field = "value";
		method();
	}
	
	public void method2() {
		field = "value";
		method();
	}
}
