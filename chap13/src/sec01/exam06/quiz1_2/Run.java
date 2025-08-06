package sec01.exam06.quiz1_2;

import java.util.HashMap;
import java.util.Map;

public class Run {

	public static void main(String[] args) {
		Map<String, Information> map = new HashMap<String, Information>();
		map.put("John", new Information("123-456-7890", 3800000));
		map.put("Emma", new Information("987-654-3210", 2300000));
		map.put("Tom", new Information("555-123-4567", 4600000));
		System.out.println("변경전: "+map);
		
		map.get("John").setSalary(4100000);
		System.out.println("변경후: "+map);
		
		
	
	}

}
