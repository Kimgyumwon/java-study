package sec01.exam05;

public class SwitchExample {

	public static void main(String[] args) {
		
		int dice = (int)(Math.random()*6)+1;
		
	switch (dice) {
		case 1:
			System.out.println("주사위 1");
			break;
		case 2:
			System.out.println("주사위 2");
			break;
		case 3:
			System.out.println("주사위 3");
			break;
		case 4:
			System.out.println("주사위 4");
			break;
		case 5:
			System.out.println("주사위 5");
			break;
			default: //옵션
				System.out.println("주사위 6");
				break;
		}
		
		
		
		
	}

}
