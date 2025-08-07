package test;

public class NumList {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5};
		int a = 0;
		int b = 0;
		for (int i = 0; i < list.length; i++) {
			if ( list[i]%2 == 0 ) {
				a++;
			} else {
				b++;
			}
		}
			
		System.out.println("짝수의 개수: " + a + "\t홀수의 개수: " + b);
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
