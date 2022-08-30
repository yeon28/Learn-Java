package P05.hashmap2;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Student, Integer> map = new  HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 92);
		
		System.out.println("총 entry 수 : " + map.size());
		
		map.forEach((key, value) -> {
			System.out.println("key : " + key.getName()+ " , " + key.getSno() 
									+ " / value : " + value);
		});
	}
	
}
