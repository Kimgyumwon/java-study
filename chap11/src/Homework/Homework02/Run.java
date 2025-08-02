package Homework.Homework02;

public class Run {
	public static void main(String[] args) {
		String[] data = new String[4];
		data[0] = "서울특별시 금천구 구로디지털2로 95";
		data[1] = "서울특별시 서대문구 연희로 248";
		data[2] = "울산광역시 남구 돋질로 233";
		data[3] = "경상북도 구미시 송정대로 55";
		Practice pra = new Practice();
		for (int i = 0; i < data.length; i++) {
			System.out.println(pra.takeState(data[i]));
		}
		
		
		
		
		
	}
}
