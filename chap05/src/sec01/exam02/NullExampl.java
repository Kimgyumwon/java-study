package sec01.exam02;

public class NullExampl {

	public static void main(String[] args) {

//		String hoppy = null;
//		System.out.println(hoppy.length()); // 예외 발생(객체가 없으니 메소드 이용 불가)
		
		String hobby = "배드민턴";
		System.out.println(hobby.length());
		
		String name = "김겸원";
		name = null; // 참조를 끊음
		// 이 때 "김겸원" 이라는 객체는 쓰레기 객체가 됨
		// Garbage Collector가 CPU가 한가할 때나 메모리가 부족할 때 메모리에서 제거됨
	}

}
