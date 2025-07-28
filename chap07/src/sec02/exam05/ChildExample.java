package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent par = new Child(); // 자동 타입 변환
		par.field1 = "data1";
		par.method1();
		par.method2();
//		// Parent 타입에는 없으므로 쓸 수 없다.
//		par.field2 = "data2";
//		par.method3(); 
		
		Child child = (Child)par; // 강제 타입 변환
		child.field2 = "yyy";
		child.method3();
		child.method1();
		child.method2();
	}

}
