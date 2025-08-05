package Homework.Homework02;

import java.util.Scanner;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController controller = new LotteryController();
	public void mainMenu() {
		while(true) {
		System.out.println("===== 로또 번호 추첨 =====");
		System.out.println("원하시는 메뉴의 번호를 입력하세요.");
		System.out.println("1. 추첨 대상 추가");
		System.out.println("2. 추첨 대상 삭제");
		System.out.println("3. 추첨 대상 목록 조회");
		System.out.println("4. 당첨 대상 구성");
		System.out.println("5. 정렬된 당첨 대상 확인");
		System.out.println("6. 당첨 대상 검색");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 : ");
		int a = sc.nextInt();
		switch (a) {
		case 1:insertObject(); break;
		case 2:deleteObject(); break;
		case 3:searchObject(); break;
		case 4:	
		case 5:	
		case 6:	
		case 9:	
		default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); 
		}
		
		if( a == 9) {
			System.out.println("프로그램 종료."); break;
		}
		}
	}
	// 1. 추첨 대상 추가용 메소드
	public void insertObject() {
		int count = 0;
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		while(count < num ) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("휴대폰 번호(-빼고) : ");
			String phone = sc.nextLine();
			Lottery random = new Lottery(name, phone);
			controller.insertObject(random);
			count++;
		}
		System.out.println(count +"명 추가 완료되었습니다.");
 	}
	// 2. 추첨 대상 삭제용 메소드
	public void deleteObject() {
		sc.nextLine();
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		Lottery delete = new Lottery(name, phone);
		boolean delete1 = controller.deleteObject(delete);
		if (delete1 == true) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	// 3. 추첨 대상 목록 조회 메소드
	public void searchObject() {
		System.out.println(controller.searchObject());
	}
	// 4. 당첨 대상 확인용 view 메소드
	public void winObject() {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		System.out.println(controller.lottery);
		if (controller.winObject() == null) {
			System.out.println("추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다.");
		}
	}
	
	
	
	
	
}
