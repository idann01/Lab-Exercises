package lab6;
import java.util.*;

public class Q4 {
	
	public static HashMap getStudents(HashMap<String, Integer> hmap) {
		
		HashMap<String, String> hMap = new HashMap<>();
		
		for (Map.Entry e : hmap.entrySet()) {
			
			int m = (int)e.getValue();
           
			if(m > 69 && m < 80) {
				
            	hMap.put((String)e.getKey(), "Bronze MEDAL");
            
			} else if(m > 79 && m < 90) {
            	hMap.put((String)e.getKey(), "Silver MEDAL");
            
			} else {
            	if(m > 89 && m < 101) {
            		hMap.put((String)e.getKey(), "Gold MEDAL");
            	}
            }
		}
		
		return hMap;
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
	    map.put("Ram", 70);
	    map.put("Sam", 81);
	    map.put("Ravi", 92);
	    map.put("Harish", 52);
	    System.out.println(getStudents(map));
	}
}