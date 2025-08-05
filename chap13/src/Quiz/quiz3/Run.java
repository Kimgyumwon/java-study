package Quiz.quiz3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		
		// storage1의 값을 넣을 빈 hashSet 생성
		Set<Equipment> bin1 = new HashSet<Equipment>();
		Set<Equipment> bin2 = new HashSet<Equipment>();
		Set<Equipment> bin3 = new HashSet<Equipment>();
		
		//초기 정보
		Set<Equipment> storage1 = new HashSet<Equipment>();
		storage1.add(new Equipment("라켓",15000));
		storage1.add(new Equipment("배트",6000));
		storage1.add(new Equipment("축구공",3000));
		Set<Equipment> storage2 = new HashSet<Equipment>();
		storage2.add(new Equipment("배트",6000));
		storage2.add(new Equipment("야구공",5000));
		storage2.add(new Equipment("글로브",9000));
		
		// 빈 HashSet에 값 넣기
		bin1.addAll(storage1);
		bin2.addAll(storage1);
		bin3.addAll(storage1);
		
		//합집합
		bin1.addAll(storage2);
		Iterator<Equipment> pr1 = bin1.iterator();
		System.out.println("*** 합집합 ***");
		while(pr1.hasNext()) {
			Equipment e1 = new Equipment();
			e1 = pr1.next();
			System.out.println(e1.toString());
		}
		//교집합
		bin2.retainAll(storage2);
		Iterator<Equipment> pr2 = bin2.iterator();
		System.out.println("*** 교집합 ***");
		while(pr2.hasNext()) {
			Equipment e1 = new Equipment();
			e1 = pr2.next();
			System.out.println(e1.toString());
		}
		//차집합
		bin3.removeAll(storage2);
		Iterator<Equipment> pr3 = bin3.iterator();
		System.out.println("*** 차집합 ***");
		while(pr3.hasNext()) {
			Equipment e1 = new Equipment();
			e1 = pr3.next();
			System.out.println(e1.toString());
		}
	}
}