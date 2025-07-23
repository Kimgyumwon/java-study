package sec03.exam03.quiz;

public class Computer {
	// 필드
	String model;
		
	
	
	//생성자
	Computer(){
		System.out.println("객체생성완료: " + "model");
	}
	Computer(String model){
		this.model = model;
		System.out.println("객체생성완료: " + model);
	}
	
	
	
	
	
}
