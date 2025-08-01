package Homework.Homework01;

public class Run {
	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] str1 = new String[3];
		
		str1 = str.split("\n");
		Person[] per = new Person[3];
		
		
		
		for (int i = 0; i < str1.length; i++) {
			String[] str2 = str1[i].split(",");
			per[i] = new Person(str2[0],Integer.parseInt(str2[1]), str2[2],str2[3].charAt(0));
			
		}
		
		for(Person people : per) {
			System.out.println(people.toString());
		}
		
		
	}
}
