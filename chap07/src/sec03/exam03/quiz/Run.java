package sec03.exam03.quiz;

public class Run {

	public static void main(String[] args) {
		
		FormalEmployee fe = new FormalEmployee("홍길동", "총무부", 1, 5000);
	    System.out.println(fe.getInfo());
	    System.out.println(fe.getName() + "의 급여: " + fe.getPay());
	    
	    InformalEmployee ie = new InformalEmployee("이비정", "영업부", 250);
	    System.out.println(ie.getInfo());
	    System.out.println(ie.getName() + "의 급여: " + ie.getPay());
	}

}
