package Homework.Homework04;

public class NumberController {
	
	public NumberController() {
	}
	
	public boolean checkDouble(int num1 , int num2) throws NumRangeException {
		if(num1 >= 1 && num1 <=100 && num2 >= 1 && num2 <=100) {
			if(num1%num2 == 0 ) {return true;} else {return false;}
		}
		throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		
	}
	
}
