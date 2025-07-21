package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 2행 3열 2차원 배열 
		int[][] mathScores = new int[2][3];
		
		//2차원 배열의 모든 요소에 접근하려면 중첩 for문이 필요
		// 바깥 for문 => 행을 반복
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScore["+i+"]"+"["+j+"]:"+mathScores[i][j]);
				
			}
		}
		//2행의 2차원 배열
		int [][] englishScore = new int[2][];
		englishScore[0] = new int[2];
		englishScore[1] = new int[3];
		int sum3 = 0;
		for (int i = 0; i < englishScore.length; i++) {
			System.out.println("");
			for (int j = 0; j < englishScore[i].length; j++) {
				sum3++;
				englishScore[i][j] = sum3;
				System.out.print(englishScore[i][j] + " ");
			}
		}
		System.out.println();
		// 값 목록으로 2차원 배열 만들기
		int [][] javaScores = new int[][]{
			{95,80},
			{92,96,80}
		};
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores["+i+"]"+"["+j+"]:"+javaScores  [i][j]);
				
			}
		}
		
			
			
			
			
			
	}

}
