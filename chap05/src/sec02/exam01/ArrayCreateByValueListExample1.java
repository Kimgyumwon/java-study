package sec02.exam01;

public class ArrayCreateByValueListExample1 {
	
	public static void main(String[] args) {
		// 값 목록을 이용해서 배열 생성
		// 1. 배열 변수 선언과 동시에 값 대입
		//int[] scores = new int[]{83,90,87};
		int [] scores = {83,90,87};
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		// 반복문을 이용해서 합계 구하기
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("합계: "+ sum);
		double avg = sum / 3.0;
		System.out.println("평균: " + avg);
		
		String[] a = new String[] { "사과" , "바나나" , "오렌지" , "포도" , "딸기" };
		for(int b = 0; b < a.length; b++) {
			System.out.println(a[b]);
		}
		
	}

}
