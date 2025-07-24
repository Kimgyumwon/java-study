package sec05.exam05;

public class Person {
	// 필드
	final String nation = "Korea"; //선언 시 초기화
	final String ssn; //생성자에서 초기화
	String name; // 
	
	//생성자
	public Person(String ssn , String name) {
		this.ssn = ssn;
		this.name = name;
//		this.nation = "America"; 선언과 동시에 초기화 시킨 final 필드는 생성자에서도 변경 불가
	}
	
	
}
