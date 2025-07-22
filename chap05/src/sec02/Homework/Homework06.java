package sec02.Homework;

import java.util.Iterator;

public class Homework06 {

	public static void main(String[] args) {
		int line = 5;
		
		for (int i = 1; i <=line; i++) {
			
			for (int j = 0; j <= line -i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}

}
