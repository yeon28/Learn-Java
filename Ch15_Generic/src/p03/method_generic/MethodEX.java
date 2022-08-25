package p03.method_generic;

public class MethodEX {

	public static void main(String[] args) {
//		Box<Integer> b = Util.boxing(100); // 문법적으로 틀린 코드는 아니지만 정석이 아님
		Box<Integer> b = Util.<Integer>boxing(100);
		// auto boxing (primitive to Integer)
		
		int i = b.getT();
		
		System.out.println(i);
		
		Box<String> s = Util.<String>boxing("홍길동");
		String name = s.getT();
		
		System.out.println(name);
		
	}
	
}
