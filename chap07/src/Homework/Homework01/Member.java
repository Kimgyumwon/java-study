package Homework.Homework01;

public class Member {
	private String memberld;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {
		
	}
	public void changeName(String name) {
		this.memberName = name;
	}
	public void printName() {
		System.out.println(memberName);
	}
	
	
}
