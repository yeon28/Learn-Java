package p11.wrapper_class;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		Integer obj = 100; // auto boxing
		System.out.println(obj.intValue());
		System.out.println(obj);
		
		int i = obj; // auto unboxing
		System.out.println(i);
		
		int result = obj + 100; // auto unboxing
		System.out.println(result);
		
//		-----------------------------------
		
		Double obj2 = 100.23; // auto boxing
		System.out.println(obj2.doubleValue());
		System.out.println(obj2);
		
		double d = obj2; // auto unboxing
		System.out.println(d);
		
		double dResult = obj2 + 12.3; // auto unboxing
		System.out.println(dResult);
		
	}
	
}
