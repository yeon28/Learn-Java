package p04.generic_extend;

import p04.generic_extends.Util;

public class GenericExtendsEx {

	public static void main(String[] args) {
		
//		int result = Util.compare("a", "b");
//		--> The method compare(T, T) in the type Util is not applicable for the arguments (String, String)
		
		int result = Util.compare(10, 20);
		System.out.println(result);
		
		result = Util.compare(30, 30);
		System.out.println(result);
		
		result = Util.compare(50, 40);
		System.out.println(result);
	}
	
}
