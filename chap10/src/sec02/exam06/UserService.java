package sec02.exam06;

public class UserService {
	public void registerUser(int age) throws InvalidAgeException{
		if(age < 0 ) {
			// throw: 예외 발생시키기
			throw new InvalidAgeException("나이는 0보다 작을 수 없습니다");
		}
		System.out.println("사용자 등록 완료 (나이 : "+ age +")");
	}
	
	
	
	
	
	
	
	
}
