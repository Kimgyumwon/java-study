package Homework.Homework01;

public class Food extends Product {
	private int expirationDays;
	
	public Food() {
	}
	
	public Food(String name , int price , int expirationDays) {
		super(name , price);
		this.expirationDays = expirationDays;
	}

	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscounRate() {
		if(expirationDays <= 1) return 80;
		else if(expirationDays <= 5) return 50;
		else if(expirationDays <= 10) return 20;
		else return 0;
	}
	
	@Override
	public int calculatePrice() {
		int discountRate = calculateDiscounRate();
		return (int)(getPrice() * (1- discountRate/100.0));
	}
	
	
}

//return //(int)(getPrice()- (getPrice()*((double)calculateDiscounRate()/100.0))) ;