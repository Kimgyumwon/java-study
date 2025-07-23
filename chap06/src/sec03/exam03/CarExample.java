package sec03.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println("c.company: " + c.company);
		System.out.println("c.model: " + c.model);
		System.out.println("c.color: " + c.color);
		System.out.println("c.maxSpeed: " + c.maxSpeed);
		System.out.println();
		
		Car c2 = new Car("자가용");
		System.out.println("c2.company: " + c2.company);
		System.out.println("c2.model: " + c2.model);
		System.out.println("c2.color: " + c2.color);
		System.out.println("c2.maxSpeed: " + c2.maxSpeed);
		System.out.println();
		
		Car c3 = new Car("자가용","빨강");
		System.out.println("c3.company: " + c3.company);
		System.out.println("c3.model: " + c3.model);
		System.out.println("c3.color: " + c3.color);
		System.out.println("c3.maxSpeed: " + c3.maxSpeed);
		System.out.println();
		
		Car c4 = new Car("택시","검정",200);
		System.out.println("c4.company: " + c4.company);
		System.out.println("c4.model: " + c4.model);
		System.out.println("c4.color: " + c4.color);
		System.out.println("c4.maxSpeed: " + c4.maxSpeed);
		System.out.println();
		
		
	}

}
