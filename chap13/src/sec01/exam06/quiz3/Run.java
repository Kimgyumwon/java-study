package sec01.exam06.quiz3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		Map<String, Planet> map = new HashMap<String, Planet>();
		map.put("Mercury", new Planet("수성", 4879, 0.24));
		map.put("Venus", new Planet("금성", 12104, 0.62));
		map.put("Earth", new Planet("지구", 12742, 1.0));
		map.put("Mars", new Planet("화성", 6779, 1.88));
		
		System.out.println("*** keySet() 사용 ***");
		Set<String> set = map.keySet();
		for (String string : set) {
			Planet a = new Planet();
			 a = map.get(string);
			 System.out.println("행성 이름: " + string +a);
		}
		Set<Map.Entry<String, Planet>> entry = map.entrySet();
		System.out.println("*** entrySet() 사용 ***");
		
		for (Entry<String, Planet> entry2 : entry) {
			System.out.println("키: " + entry2.getKey()+ " 값 " + entry2.getValue());
		}
		

	}

}
