package sec03.exam04.quiz;

public class Animal {
	//필드
	String kind;
	int age;
	//생성자
	Animal(String kind,int age){
		this.kind = kind;
		this.age = age;
	}
	Animal(String kind){
		this(kind,1);
		
	}
	Animal(int age){
		this("사람",age);
	}
	
	
	// 출력 메소드
    public void info() {
        System.out.println(kind + ": " + age + "살");
    }
	
    
    
    
	
}
