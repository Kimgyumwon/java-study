package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController controller = new BookController();
	public void mainMenu() {
		
		while(true) {
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
			switch (a) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 5: ascBook(); break;
			
			default:  System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
			if ( a == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			
		}
	}
	
	public void insertBook() {
		sc.nextLine();
		System.out.println("=== 도서 등록 ===");
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
		controller.insertBook(book);
		sc.nextLine();
	}
	 public void selectList(){
		 System.out.println("=== 전체 조회 ===");
		 List<Book> list = new ArrayList<Book>(controller.selectList());
		 if (list.isEmpty()) {
			 System.out.println("존재하는 도서가 없습니다.");
		 } else {
			 for (Book e : list) {
				 System.out.println(e.toString());
			 }
		 }
	 }
	
	public void searchBook(){
		System.out.println("=== 도서 검색 ===");
		sc.nextLine();
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		List<Book> searchList = new ArrayList<Book>(controller.searchBook(keyword));
		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Book e : searchList) {
				System.out.println(e.toString());
			}
		}
		
    }
	public void deleteBook(){
		sc.nextLine();
		System.out.println("=== 도서 삭제 ===");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		Book remove = new Book();
		remove = controller.deleteBook(title, author);
		if (controller.BookList.indexOf(remove) != -1) {
			controller.BookList.remove(remove);
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
       
    }
	public void ascBook(){
		 if (controller.ascBook() == 1) {
			 System.out.println("정렬에 성공하였습니다.");
		 } else {
			 System.out.println("정렬에 실패하였습니다.");
		 }
	}
	
	
	
}
	
	
