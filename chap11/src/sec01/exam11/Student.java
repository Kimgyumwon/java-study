package sec01.exam11;

import java.util.Objects;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) return false;
		Student a = (Student) obj;
		return this.studentNum.equals(a.studentNum);
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}
	
	
}
