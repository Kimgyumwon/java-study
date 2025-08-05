package Quiz.quiz2;

import java.util.HashSet;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		Set<Food> ch = new HashSet<Food>();
		ch.add(new Food("샐러드",14000));
		ch.add(new Food("치킨",23000));
		ch.add(new Food("치킨",50000));
		
		ch.remove(new Food("치킨", 50000));
		
		System.out.println("5만원 치킨 취소: " +ch);
		ch.clear();
		System.out.println("전체 주문 취소: " + ch);
	}

}
