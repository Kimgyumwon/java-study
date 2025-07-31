package Homework.Homework04;

public class Run {

	public static void main(String[] args) {
		SmartPhone[] phone = new SmartPhone[2];
		phone[0] = new GalaxyS24();
		phone[1] = new Iphone15();
		for(int i =0; i<=1; i++) {
			phone[i].printMaker();
			phone[i].makeCall();
			phone[i].takeCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
			System.out.println();
		}
		
		
	}

}
