package sec01.exam02;

public class MemberExample {

	public static void main(String[] args) {
		Member object1 = new Member("blue");
		Member object2 = new Member("blue");
		// obj1 과 obj2는 물리적으로는 다른 객체, 논리적으로는 동등 개체
		// 주소값은 다르지만 안에 같은 데이터를 저장
		
		Member object3 = new Member("red");
		// equals() 메소드는 재정의 전: 같은 객체인지 비교(번지 비교)
		// equals() 메소드는 재정의 후: 논리적 동등비교 
		if(object1.equals(object2)) {
			System.out.println("obj1 과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1 과 obj2는 동등하지 않습니다.");
		}
		if(object1.equals(object3)) {
			System.out.println("obj1 과 obj3는 동등합니다.");
		}else {
			System.out.println("obj1 과 obj3는 동등하지 않습니다.");
		}
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		
	}
}
