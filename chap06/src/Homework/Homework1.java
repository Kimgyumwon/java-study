package Homework;

public class Homework1 {

	public static void main(String[] args) {
		int[] height = {152,180,165,158,171};
		int temp;
		for (int i = 0; i < height.length-1; i++) {
			for (int j = 0; j < height.length-1-i; j++) {
				if(height[j] > height [j+1]) {
					temp = height[j];
					height[j] = height[j+1];
					height[j+1] = temp;
				}
			}
		}
		
		for(int num : height) {
			System.out.println(num + " ");
		}
		
		
		
		
	}

}
