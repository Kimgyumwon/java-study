package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData;
	
		while(true) {
			inputData = sc.nextLine(); // 스캐너에서 읽은 한 줄 전체
			System.out.println("입력된 문자열: " + inputData);
			if(inputData.equals("q") ) break;
			
		 
		}
		System.out.println("종료되었습니다.");
		// Scanner 클래스는 사용자의 입력을 다양한 타입으로 자동 변환해주는 기능을 제공
		int data , data1;
		data = sc.nextInt();
		data1 = sc.nextInt();
		System.out.println(data + "," +data1);
		
		int age;
		age = sc.nextInt();
		sc.nextLine(); //버터 비우기(중요!)
		String name = sc.nextLine();
		System.out.println("name: "+ name);
	}

}

// Quiz
// 2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오
// 10 20 => 10,20

// 주의!
// nextInt()나 next()는 입력 후 개행 문자(\n) 버퍼에 남긴다.
// 따라서 그 다음에 nextLine()을 쓰면 개행을 읽어버려서 빈 문자열("")이 들어감

// 해결법: 중간에 sc.nextLine()을 한번 호출해 버퍼를 정리