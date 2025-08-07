package sec02.exam01;
import java.util.Stack;
// 동전 케이스를 Stack 클래스로 구현한 예제
// 동전케이스는 위에만 열려있는 스택 구조를 가짐
// 먼저 넣은 동전은 제일 밑에 깔리고 나중에 넣은 동전이 위에 쌓이기 때문에
// Stack에서 동전을 빼면 마지막에 넣은 동전이 먼저 나오게 됨
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coin = new Stack<Coin>();
		// 동전을 끼움
		coin.push(new Coin(100));
		coin.push(new Coin(50));
		coin.push(new Coin(500));
		coin.push(new Coin(10));
		// 동전 케이스가 비었는지 확인
		while (!(coin.isEmpty())) {
			// 제일 위의 동전을 꺼냄
			Coin val = coin.pop();
			System.out.println(val);
		}
	}
}
