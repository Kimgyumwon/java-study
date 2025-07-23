package Homework;

import java.util.Arrays;
//(int)(Math.random()*45+1);
public class Homework4 {

	public static void main(String[] args) {
		
		int num = 0;
		int[] arr = new int[6];
		int count = 0;
		while(count<6) {
			num = (int)(Math.random()*45+1);
			boolean duplicate = false;
			for(int i=0; i<count; i++) { //중복확인
				if(arr[i] == num) {   
					duplicate = true;
					break;
				}
			}
			if(!duplicate) { //중복이 없으면 배열에 추가
				arr[count] = num;
				count++;
			}
			
			
		}
		
		Arrays.sort(arr); // 오름차순 정렬
		for (int f = 0; f < arr.length; f++) { // 배열 출력
			System.out.print(arr[f]+" ");
		}
		
		
		

	}

}
