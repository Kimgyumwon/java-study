package Homework.Homework02;

public class Drink extends menu{
	private String recipe;
	
	public Drink() {
	}

	public Drink(String name, int price , String recepi) {
		super(name, price);
		this.recipe = recepi;
	}
	
	@Override
	public void cook() {
		System.out.println(toString() + "레시피는 " + recipe + "입니다");
	}
	
	
	
	
	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
	
	
	
	
	
}
