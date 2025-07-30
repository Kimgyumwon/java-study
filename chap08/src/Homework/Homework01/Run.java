package Homework.Homework01;

public class Run {
	public static void main(String[] args) {
		Product p1 = new Food("치킨", 20000, 100);
		
		Product p2 = new Book("자바의 정석", 15000);
		
		System.out.println(p1.getName() + "의 최종 가격 : " + p1.calculatePrice() );
		System.out.println(p2.getName()+ "의 최종 가격 : "+p2.calculatePrice());
	}
}
