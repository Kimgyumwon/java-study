package sec04.exam05.Quiz;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int begin = sc.nextInt();
		int end = sc.nextInt();
		
		Calculator calc = new Calculator();
		System.out.println(calc.getEvenTotal(begin, end));

	}

}
