package sec01.exam23;

public class StringValueOfExample {

	public static void main(String[] args) {
		//기본 타입 값을 문자열로 변환
		String str1 =String.valueOf(10);
		String str2 =String.valueOf(10.5);
		String str3 =String.valueOf(false);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// 문자열로 변환하는 간단한 방법
		String str11 = ""+10;
		String str12 = ""+10.5;
		String str13 = ""+true;
		System.out.println(str11);
		System.out.println(str12);
		System.out.println(str13);
		
		
		
		
		
	}

}
