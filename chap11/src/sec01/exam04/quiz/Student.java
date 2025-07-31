package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	private int studentNo;
	private String name;
	private String major;
	
	
	
	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	// 동등 객체를 판단할 때
	// equals()를 오버라이딩하면 hashCode() 도 함께 오버라이딩하는 것이 일반적
//	@Override
//	public boolean equals(Object obj) {
//		// Early Return Pattern
//		if (this == obj) return true; // 같은 참조이면 true
//		if (!(obj instanceof Student)) return false; // Studnet 타입의 인스턴스가 아니면 false
//		
//		Student other = (Student) obj;
//		return this.studentNo == other.studentNo && this.name.equals(other.name);
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(studentNo,name);
//	}
//	
	
	
	
	
	
	
	
//		if (obj instanceof Student student) {
//	        return this.name.equals(student.name) && this.studentNo == student.studentNo;
//	    }
//	  	return false;
	  	
	  	
//		if (obj instanceof Student student) {
//			if (this.name.equals(student.name)) {
//				if (this.studentNo == student.studentNo) {
//					return true;
//				} else {
//					return false;
//				}
//			} else {
//				return false;
//			}
//		}
//		return false;
		  
	

	@Override
	public String toString() {
		return "[studentNo=" + studentNo + ", name=" + name + ", major=" + major + "]";
	}







	@Override
	public int hashCode() {
		return Objects.hash(name, studentNo);
	}







	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentNo == other.studentNo;
	}
		
}
