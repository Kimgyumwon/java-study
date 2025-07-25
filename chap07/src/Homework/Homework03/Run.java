package Homework.Homework03;

public class Run {

	public static void main(String[] args) {
		Employee a = new Employee();
		a.setEmpNo(100);
		a.setEmpName("홍길동");
		a.setDept("영업부");
		a.setJob("과장");
		a.setAge(25);
		a.setGender('남');
		a.setSalary(3000000);
		a.setBonus(0.05);
		a.setPhone("010-123-4567");
		a.setAddress("서울시 강남구");
		System.out.println("=== " + a.getEmpName() + "의 정보 ===");
		System.out.println("사번: " + a.getEmpNo());
		System.out.println("부서: " + a.getDept());
		System.out.println("직급: " + a.getJob());
		System.out.println("나이: " + a.getAge());
		System.out.println("월급: " + a.getSalary());
		System.out.println("전화번호: " + a.getPhone());
		System.out.println("주소: " + a.getAddress());
		
		
		
		
	}

}
