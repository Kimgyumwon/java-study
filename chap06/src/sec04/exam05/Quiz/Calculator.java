package sec04.exam05.Quiz;

public class Calculator {
	
	int getEvenTotal(int x , int y){
		int sum = 0;
		while(x <= y) {
			if(x%2 == 0) {
				sum += x;
			}
			x++;
		}
		return sum;	
	}
			
			
			
	
	

}
