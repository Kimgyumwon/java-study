package sec03.exam02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class ProductStorage {
	// product가 저장된 List 컬렉션
	private List<Product> list = new ArrayList<Product>();
	// 키보드 입력 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	private int counter; // 상품을 등록할 때 pno 값을 자동으로 부여하기 위해 사용
	
	public void showMenu() {
		while (true) {
		System.out.println("--------------------------------");
		System.out.println("1.등록  |  2.목록   |  3.종료");
		System.out.println("--------------------------------");
		
		System.out.print("선택: ");
		String selectNo = sc.nextLine();
		switch (selectNo) {
			case "1": 
				// Product 등록
				registerProduct();
				break;
			case "2": 
				// 등록된 모든 Product 정보 보기
				showProducts();
				break;
			case "3": 
				System.out.println("프로그램 종료");
				// 프로그램 종료
				return;
		}
		}
	}
	private void registerProduct() {
		Product a = new Product();
		a.setPno(++counter);
		System.out.print("상품명: ");
		a.setName(sc.nextLine());
		System.out.print("가격: ");
		a.setPrice(sc.nextInt());
		System.out.print("재고: ");
		a.setStock(sc.nextInt());
		list.add(a);
		sc.nextLine();
	}
	private void showProducts() {
		Iterator<Product> iterator = list.iterator();
		while (iterator.hasNext()) {
			Product product = (Product) iterator.next();
			
			System.out.println("상품 번호: " +product.getPno() + " 상품 이름: " + product.getName() + " 가격: " + product.getPrice() + "원 재고: " + product.getStock());
		}
	}
}
