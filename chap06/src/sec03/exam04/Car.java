package sec03.exam04;

public class Car {
	//필드
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 // 다른 생성자 호출 코드는 항상 생성자의 첫 줄에 와야한다.
	Car(){  // 1번
		this("자가용","은색",250);
	}
	Car(String model){ //2번
		this(model,"은색",250);
//		this.model=model;
//		this.color = "은색";
//		this.maxSpeed = 250;
	}
	Car(String model,String color){ //3번
		this(model,color,300);
//		this.model=model;
//		this.color=color;
//		this.maxSpeed = 300;
	}
	Car(String model,String color,int maxSpeed){ //4번
		// 공통 실행 코드 
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		
	}
	// 정리 : 중복된 필드 초기화 코드가 하나의 생성자에 집중되어, 유지보수와 가독성에 좋음
}
