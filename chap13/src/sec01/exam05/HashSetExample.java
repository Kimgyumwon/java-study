package sec01.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		// 인스턴스는 다르지만 내부 데이터가 동일한 경우
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.add(new Member("김겸", 10));
		set.add(new Member("김겸", 10)); //동등 객체
		
//		System.out.println(set);'
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김재현", 30));
		members.add(new Member("이수진", 30));
		members.add(new Member("박민수", 40));
		
		// quiz 1. set -> List 변환
		List<Member> member = new ArrayList<Member>(members);
		// 2. 정렬(나이 오름차순)
		Collections.sort(member);
		// 3. 츨력 향상된 for문
		for (Member m : member) {
			System.out.println(m.toString());
		}
		// Linked
		Set<Member> sortedSet = new LinkedHashSet<Member>(member);
		for (Member member2 : sortedSet) {
			System.out.println(member2);
		}
		
		// 중복제거
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member("김재현", 30));
		memList.add(new Member("이수진", 25));
		memList.add(new Member("박민수", 40));
		memList.add(new Member("김재현", 30));
		memList.add(new Member("이수진", 25));
		System.out.println();
		Set<Member> quiz = new HashSet<Member>(memList);
		List<Member> memList2 = new ArrayList<Member>(quiz);
		Collections.sort(memList2);
		for (Member member3 : memList2) {
			System.out.println(member3);
		}
		
		
		
		
		
	}

}
