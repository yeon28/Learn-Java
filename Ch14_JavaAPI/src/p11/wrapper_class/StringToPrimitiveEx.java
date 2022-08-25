package p11.wrapper_class;

//String을 primitive 타입 값으로 변환하는 라이브러리 --> Wrapper class내에 존재함.
public class StringToPrimitiveEx {

	public static void main(String[] args) {
		int a = Integer.parseInt("10");
		double d = Double.parseDouble("3.14");
		boolean b = Boolean.parseBoolean("true");
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(b);
	}
	
}
