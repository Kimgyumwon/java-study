package Homework;

import java.util.Arrays;

public class Homework7 {

	public static void main(String[] args) {
		String[] report = {"Introduction","Research","Conclusion"};
		
		while (true) {
			String[] feed = Arrays.copyOf(report, report.length);
			feed[0] = "Team Feedback";
			
			System.out.print("원본 보고서 : ");
			for(String str : report) {
				System.out.print(str+" , ");
			}
			System.out.println();
			System.out.print("복사된 보고서 : ");
			for(String str1 : feed ) {
				System.out.print(str1+" , ");
				}
			
			break;
		}
		
		
	}

}
