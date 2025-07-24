package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열 크기 입력
		System.out.print("배열의 크기를 입력하세요 :");
		int arraySize = sc.nextInt();
		sc.nextLine(); //버퍼 비우기
		
		//문자열 배열 생성
		String[] array = new String[arraySize];
		
		//배열 초기화
		for (int i = 0; i < arraySize; i++) { 
			System.out.print((i+1)+"번째 문자열 : ");
			array[i] = sc.nextLine().trim();
		}
		
		// 반복적으로 값 추가여부
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String add_more = sc.nextLine().trim();
			if(add_more.equalsIgnoreCase("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int plus = sc.nextInt();
				sc.nextLine(); // 버퍼 비우기
			
		// 배열확장
				String[] newArray = Arrays.copyOf(array, array.length + plus);
				for (int i = array.length; i < newArray.length; i++) {
					System.out.print((i+1) + "번째 문자열 : ");
					newArray[i] = sc.nextLine();
				}
				array=newArray; // 배열참조 변경
				// 전체 출력후 종료
			} else if (add_more.equalsIgnoreCase("N")) {
				for(String str : array) { // 전체 출력후 종료
					System.out.println(str);
				}
				break;
			} else {
				System.out.println("입력할 수 없는 값입니다.");
			}
		}
		
		
		
		

	}

}
