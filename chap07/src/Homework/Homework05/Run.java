package Homework.Homework05;

public class Run {

	public static void main(String[] args) {
		Student a = new Student();
		a.setName("김철수");
		a.setStudentClass('A');
		System.out.println(a.getStudentNo() + " " + a.getName() + " " + a.getStudentClass());
		Student b = new Student();
		b.setName("홍길동");
		b.setStudentClass('F');
		System.out.println(b.getStudentNo() + " " + b.getName() + " " + b.getStudentClass());
		Student c = new Student();
		c.setName("이영희");
		c.setStudentClass('B');
		System.out.println(c.getStudentNo() + " " + c.getName() + " " + c.getStudentClass());
		
		
		
	}

}
