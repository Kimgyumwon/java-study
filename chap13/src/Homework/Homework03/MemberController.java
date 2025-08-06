package Homework.Homework03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	Map<String, Member> map = new HashMap<String, Member>();
	
	// 회원 가입 구현
	public boolean joinMember(String id, Member m) {
		if (map.containsKey(id)) {
			return false;
		} else {
			map.put(id, m);
			return true;
		}
	}
	// 로그인 구현
	public String logIn(String id, String password) {
		if (map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
		}
		return null;
	}
	// 비밀번호 바꾸기
	public boolean changePassword(String id, String oldPw, String newPw) {
		if (map.containsKey(id)) {
			if(map.get(id).getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				return true;
			}
		}
		return false;
	}
	// 이름 바꾸기
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	// 이름 찾기 
	public TreeMap<String,String> sameName(String name) {
		Set<String> set = map.keySet();
		Map<String, String> map2 = new TreeMap<String, String>();
		for (String str : set) {
			if ( map.get(str).getName().equals(name) ) {
				map2.put(str, name);
			}
			
		}
		return (TreeMap<String, String>) map2;
	}
	
	
	
}
