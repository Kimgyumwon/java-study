package Homework.Homework02;

public class Dish extends menu{
	private String ingredients;
	
	
	public Dish() {
	}
	
	public Dish(String name, int price , String ingredients) {
		super(name , price);
		this.ingredients = ingredients;
	}
	@Override
	public void cook() {
		System.out.println(toString() + "재료는 " + ingredients +"입니다");
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	
	
}
