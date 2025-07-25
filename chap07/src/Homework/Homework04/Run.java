package Homework.Homework04;

public class Run {

	public static void main(String[] args) {
		Person a = new Person();
		a.name = "김철수";
		a.age = 20;
		System.out.println(a.name + "는 "+ a.age + "살 입니다.");
		
		Person1 b = new Person1();
		b.setName("김철수");
		b.setAge(20);
		System.out.println(b.getName() + "는 "+ b.getAge() + "살 입니다.");
	}

}
