package test;

import java.util.Arrays;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] max = {0,16,32,15,11,31,10,2};
		
		System.out.print("배열의 크기를 입력해주세요: ");
		int z = sc.nextInt();
		
		int[] max = new int[z];
		int temp = 0;

		for (int i = 0; i < max.length; i++) {
			System.out.print("배열의 들어가 수를 입력해주세요: ");
			max[i] = sc.nextInt();
		}
		
		
		
		// 내가만든 선택정렬..
//		for (int i = 0; i < max.length-1; i++) {
//			for (int j = i+1; j < max.length; j++) {
//				if(max[i] > max[j]) {
//					temp = max[i];
//					max[i] = max[j];
//					max[j] = temp;
//				}
//			}
//		}
		// 버블 정렬
		for (int i = 0; i < max.length - 1; i++) {
		    for (int j = 0; j < max.length - 1 - i; j++) {
		        if (max[j] > max[j + 1]) {
		            temp = max[j];
		            max[j] = max[j + 1];
		            max[j + 1] = temp;
		        }
		    }
		}
		
		for (int i : max) {
			System.out.print(i + ", ");
		}
		int a = max[max.length-1];
		int b = max[max.length-2];
		System.out.println("배열의 최대 곱: " + a*b);
		
	}

}
