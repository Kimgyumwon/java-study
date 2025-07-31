package sec01.exam03;

import java.util.Objects;

public class Key {
	public	int number;
	public String name;
	public Key(int number , String name) {
		this.name = name;
		this.number = number;
	}
	
	public Key(int number) {
		this.number =number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(key.number == this.number) return true;
		}else {
			return false;
		}
		return false;
	}
	// 자바에서 여러 필드를 조합하여 간편하게 hashCode()를 만들 수 있도록 제공되는 유틸리티 메소드
	// 가변 인자를 받아서 자동으로 적절한 해시코드를 계산해줌
	@Override
	public int hashCode() {
		return Objects.hash(number,name);
	}
	
	
}
