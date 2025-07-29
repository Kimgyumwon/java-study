package sec04.Homework;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		//Student 필드 학생 3명 출력
		Person[] p1 = new Student[3];
		p1[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		p1[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		p1[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		for(int i =0; i<3; i++) {
			System.out.println(p1[i].toString());
		}
		// 사원 입력받고 출력
		Person[] p2 = new Employee[10];
		Scanner sc= new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.println("=== 사원 입력받기 ===");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			sc.nextLine();
			String dept = sc.nextLine();
			p2[count] = new Employee(name, age, height, weight, salary, dept);
			System.out.print("계속 인원을 추가하시겠습니까? y , n");
			String yn = sc.nextLine();
			
			if(yn.equalsIgnoreCase("y") ) {
				count++;
				continue;
				
			}else if(yn.equalsIgnoreCase("n")) break;
		}
		for(int i =0; i<=count; i++) {
			System.out.println(p2[i].toString());
		}



		
		
		
		
	}

}
