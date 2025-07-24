package Homework.Homework02;

public class RunName {

	public static void main(String[] args) {
		Employee em = new Employee();
		Employee em1 = new Employee();
		
		em.name = "김철수";
		em.team = "교육운영팀";
		
		em1.name = "이영희";
		em1.team = "경영지원팀";
		
		System.out.println(em.name);
		System.out.println(em.team);
		
		System.out.println(em1.name);
		System.out.println(em1.team);
		
		
		
	}

}
