package Homework.Homework02;

public class Run {

	public static void main(String[] args) {
		Person per = new Person();
		Person per1 = new Person();
		
		per.setPhoneNumber("01012345678");
		per.height = 190.5;
		per.weight = 100.2;
		
		per1.setPhoneNumber("01056434563");
		per1.height = 175.4;
		per1.weight = 65.6;
		
		System.out.println(per.phoneNumber);
		System.out.println(per.height);
		System.out.println(per.weight);
		System.out.println(per1.phoneNumber);
		System.out.println(per1.height);
		System.out.println(per1.weight);
		
		
		
	}

}
