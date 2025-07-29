package sec04.Homework2;

public class ChocolateController {
	 private Chocolate c = new Chocolate();
	
	public String backChocolateCake(double flour , double cream, int cherry , int chip) {
		c = new Chocolate(flour ,cream,cherry ,chip);
		return c.toString();
	}
	
}
