package sec02.exam03;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0]; // 실행 예외 발생
			data2 = args[1];
			int value1 = Integer.parseInt(data1); // 실행예외 발생
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return; // 메소드 종료
			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			
		} finally {
			System.out.println("종료합니다.");
		}
		
		
	}

}
