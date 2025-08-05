package sec01.exam05;

import java.util.Objects;

public class Member implements Comparable<Member> {
	private String name;
	private int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름= " + name + " 나이= " + age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Member o) {
		if(this.age > o.age) {
			return 1;
		} else if (this.age < o.age) {
			return -1;
		} else {
			return this.name.compareTo(o.name);
		}
		
		
//		return this.age - o.age;
	}
	
	
	
	
	
	
}
