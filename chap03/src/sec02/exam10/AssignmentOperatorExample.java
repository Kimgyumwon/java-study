package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result="+result);
		
		result -= 5;
		System.out.println("result="+result);
		
		result *= 3;
		System.out.println("result="+result);
		
		result /= 5;
		System.out.println("result="+result);
		
		result %= 3;
		System.out.println("result="+result);
		
		boolean y = true;
		y |= false;
		System.out.println(y);
		y &= false;
		System.out.println(y);
		
		//Quiz 
		//금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
		// 최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int value2 = sc.nextInt();
		System.out.println("500원: "+value2/500+" 개");
		System.out.println("100원: "+value2%500/100+" 개");
		System.out.println("50원: "+value2%100/50+" 개");
		System.out.println("10원: "+value2%50/10+" 개");
		System.out.println("1원: "+value2%10+" 개");
		
		
	}

}
