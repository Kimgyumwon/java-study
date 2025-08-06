package Homework.Homework06;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요: ");
		String user = sc.nextLine();
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] split = sentence.split(" ");
		
		// 마지막 단어 일때
		if (split[split.length-1].equals(user) ) {
			System.out.println("마지막 단어입니다.");
			return;
		}
		
		
		
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals(user)) {
				System.out.println(user + " 다음 단어: " + split[i+1]);
			} 
				
			
		}
		
		// 단어가 존재하지 않을때
		if ( !(sentence.contains(user)) ) {
			System.out.println("존재하지 않는 단어입니다.");
		}
		
		
	}

}
