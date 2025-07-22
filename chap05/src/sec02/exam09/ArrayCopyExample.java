package sec02.exam09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 2. System.arraycopy() 메소드 이용
//		String[] oldStrArray = {"java","array","copy"};
//		String[] newStrArray = new String[5];
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		for (int i = 0; i < newStrArray.length; i++) {
//			System.out.println(newStrArray[i]);
//		}

		String[] oldStrArray = new String[3];
		String[] newStrArray = new String[3];
		oldStrArray[0] = "java";
		oldStrArray[1] = "java";
		oldStrArray[2] = new String("java");

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		System.out.println(oldStrArray[2] == newStrArray[2]);

		// 3. Arrays.copyOf()
		String[] newStrArray2 = Arrays.copyOf(oldStrArray, oldStrArray.length + 2);

		for (int i = 0; i < newStrArray2.length; i++) {
			System.out.print(newStrArray2[i] + " ");
		}
		
	}

}
