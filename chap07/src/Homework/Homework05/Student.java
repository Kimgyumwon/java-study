package Homework.Homework05;

public class Student {
	private static int studentNo;
	private String name;
	private char studentClass;
	
	public Student() {
		studentNo++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(char studentClass) {
		this.studentClass = studentClass;
	}

	public int getStudentNo() {
		return studentNo;
	}
	
	
	
	
}
