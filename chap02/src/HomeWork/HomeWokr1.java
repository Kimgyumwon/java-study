package HomeWork;

import java.util.Scanner;

public class HomeWokr1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("몸무게(kg) : ");
		double kg = sc.nextDouble();
		System.out.printf("키(m) : ");
		double m = sc.nextDouble();
		System.out.printf("BMI 지수: %2.1f",kg/(m*m));
		
	}

}
