package sec02.exam02.quiz2;

public class run {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		// 정답: 1.2.3.5.6
		
		System.out.println("=====");
		
		// 2. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);
			
			System.out.println(0/0);
			
			System.out.println(3);
		} catch (ArithmeticException ae) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		// 정답: 1.2.4.5.6
		
		System.out.println("=====");
		
		// 3. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);
			
			System.out.println(args[0]);
			
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		// 정답:  1.2.5

	}

}
