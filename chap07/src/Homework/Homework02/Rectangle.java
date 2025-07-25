package Homework.Homework02;

public class Rectangle {
	
	private int width;
	private int heith;
	
	public Rectangle() {
		width = 1;
		heith = 1;
	}
	public Rectangle(int width , int height) {
		this.width = width;
		this.heith = height;
	}
	
	public int calculateRound() {
		return (width+heith)*2;
	}
	
	public int calculateArea() {
		return width*heith;
	}
	
	public void printInfo() {
		System.out.println("1. 사각형의 둘레: " +calculateRound()+ "cm");
		System.out.println("2. 사각형의 넓이: " +calculateArea()+"cm");
	}
	
}
