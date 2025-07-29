package sec04.Homework;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {
		
	}
	public Student(String name , int age , double height , double weight , int grade , String major ) {
		super(age,height,weight);
		this.name=name;
		this.grade = grade;
		this.major = major;
		
	}
	
	@Override
	public String toString() {
		return "===" + getName() + "===" + "\n"
			+  "나이 : " + getAge() + "\n"
			+  "키 : " + getHeight() + "\n"
			+  "몸무게 : " + getWeight()+ "\n"
			+  "학년 : " + grade + "\n"
			+  "전공 : " + major;
	}
	
}
