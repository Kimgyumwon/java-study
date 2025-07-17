package HomeWork;

import java.util.Scanner;

public class HomeWokr2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("가로 : ");
		double a = sc.nextDouble();
		System.out.printf("세로 : ");
		double b = sc.nextDouble();
		
		System.out.printf("면적 : %.2f\n",(a*b));
		System.out.printf("둘레 : %.1f",(a+b)*2);
		
		
	}

}
