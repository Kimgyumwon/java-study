package sec04.exam05.Quiz;

public class Rectangle {
	//필드
	int width;
	int height;
	
	//메소드
	   void area() { //직사각형의 넓이를 출력
		System.out.println("면적 : " + width*height);
	}
	   void length() { //직사각형의 둘레
		System.out.println("둘레: " + (width*2+height*2));
	}
	   
}
