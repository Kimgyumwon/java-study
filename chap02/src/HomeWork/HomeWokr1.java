package HomeWork;

import java.util.Scanner;

public class HomeWokr1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kg = sc.nextDouble();
		double m = sc.nextDouble();
		System.out.printf("BMI 지수: %2.1f",kg/(m*m));
		
	}

}
