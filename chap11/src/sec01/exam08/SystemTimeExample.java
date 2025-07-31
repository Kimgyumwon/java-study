package sec01.exam08;

import java.util.Iterator;

public class SystemTimeExample {

	public static void main(String[] args) {
		// 1 부터 100만까지 합을 구하는데 걸리는 시간
		double
		time1 =System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i <=1000000; i++) {
			sum += i;
		}
		System.out.println("1~100만까지의 합 : " + sum);
		
		double time2 = System.nanoTime();
		System.out.println("프로그램 작동한 시간 : "+ (time2-time1)/1000000000 +"초 소요");
		
		// 주로 실행 시간(성능) 측정할 때 사용
		
		
		
	}

}
