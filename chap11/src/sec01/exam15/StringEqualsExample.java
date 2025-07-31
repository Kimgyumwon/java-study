package sec01.exam15;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = new String("김");
		String strVal2 = "김";
		String strVal3 = "김";
		if (strVal1 == strVal2) {
			System.out.println("같은");
		} else {
			System.out.println("다른");
		}
		if (strVal2 == strVal3) {
			System.out.println("같은");
		} else {
			System.out.println("다른");
		}
		if (strVal1.equals(strVal2)) {
			System.out.println("같은");
		} else {
			System.out.println("다른");
		}
		if (strVal2.equals(strVal3)) {
			System.out.println("같은");
		} else {
			System.out.println("다른");
		}
		
		
		
		
	}

}
