package Homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = 0;
		
		while(true) {
			System.out.print("정수 : ");
			len = sc.nextInt();
			if(len >= 3 && len%2 == 1) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		int[] arr = new int[len];
		int mid = len/2;
		
		for (int i = 0; i <= mid; i++) {
			arr[i] = i+1;
		}
		for (int i = mid+1; i < len; i++) {
			arr[i] = len - i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
	}
}


