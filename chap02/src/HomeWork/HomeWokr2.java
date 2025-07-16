package HomeWork;

import java.util.Scanner;

public class HomeWokr2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.printf("면적 : %5.2f\n",(a*b));
		System.out.printf("둘레 : %4.1f",(a+b)*2);
		
		
	}

}
