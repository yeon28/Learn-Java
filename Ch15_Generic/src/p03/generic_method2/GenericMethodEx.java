package p03.generic_method2;

public class GenericMethodEx {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		
		boolean result = Util.<Integer, String>compare(p1,p2);
		
		if (result) {
			System.out.println("p1과 p2는 논리적으로 동등한 객체");
		} else {
			System.out.println("p1과 p2는 논리적으로 동등한 객체 아님");
		}
		
		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
		
		result = Util.<String, String>compare(p3,p4);
		
		if (result) {
			System.out.println("p3과 p4는 논리적으로 동등한 객체");
		} else {
			System.out.println("p3과 p4는 논리적으로 동등한 객체 아님");
		}
	}
	
}


