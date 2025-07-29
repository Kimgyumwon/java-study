package sec04.Homework;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
	}

	public Employee(String name, int age, double height, double weight ,int salary, String dept) {
		super( age , height , weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		
		return "===" + getName() + "===" + "\n"
				+  "나이 : " + getAge() + "\n"
				+  "키 : " + getHeight() + "\n"
				+  "몸무게 : " + getWeight()+ "\n"
				+  "급여 : " + salary + "\n"
				+  "부서 : " + dept;
	}
	
	
}
