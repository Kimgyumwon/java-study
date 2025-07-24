package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); // 컴파일에러
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
			
		if (obj2 == obj3) {
		System.out.println("같은 Singleton");
		} else { 
			System.out.println("다른 Singleton");
		}

	}
	
}






