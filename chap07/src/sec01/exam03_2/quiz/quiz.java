package sec01.exam03_2.quiz;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		Point3D p = new Point3D(x, y, z);
		System.out.println(p.location());
		
		

	}

}
