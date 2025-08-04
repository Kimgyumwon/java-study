package Homework;

import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		System.out.println(" === 가남 도서관에 오신걸 환영합니다 ===");
		System.out.println("원하시는 업무의 번호를 선택하세요.");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 선택 :");
		int a = sc.nextInt();
		
	}
	
	public void insertBook() {
		sc.nextLine();
		System.out.print("=== 도서 등록 ===");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 : ");
		int category = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		String category2 = null;
		switch (category) {
		case 1: category2 = "인문"; break;
		case 2: category2 = "자연과학"; break;
		case 3: category2 = "어린이"; break;
		default: category2 = "기타"; break;
		}
		Book book = new Book(title, author, category2, price);
	}
 
	
	
	
}
	
	
