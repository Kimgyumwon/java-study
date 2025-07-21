package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83 , 90 , 87};
		scores = new int[] { 83 , 90 , 87 , 90 ,}; // length 속성을 쓰면 배열이 변경됐을 때도 코드 변경이 없다
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		
		System.out.println("합계: "+sum);
		double avg = sum/1.0/scores.length;
		System.out.println("합계: "+ avg);
	
		//quiz
		// 총 10명의 학생들의 출석 여부를 표현한 배열 attendance 있습니다.
		//학생이 출석한 경우 1, 결석한 경우 0으로 표시되어 있습니다.
		// 출석한 학생의 수를 계산하여 출력하시오.
		int[] attendance = {1,1,1,1,1,0,1,0,0,1};
		int sum1 = 0;
		
		for (int i = 0; i < attendance.length; i++) {
			if( attendance[i]==1) {
				sum1 += 1;
			}
		}
		System.out.println("출석 인원 수: "+sum1);
		
		
	}

}
