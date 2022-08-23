package p01.object_class_equals;

/*
 Object class�� equals method ��� ���� ����
 - equals method�� == �����ڿ� ���� ����� ������.
 - object1 == object2 ����� false
 - object1.equals(object2) ����� false
 String class�� equals method����
 - Object Ŭ������ equals method�� override���� ���� �ڵ���.
 - ���ڿ� ������ ������ true
 */
public class ObjectEqualsEx {

	public static void main(String[] args) {
		
		Object object1 = new Object();
		Object object2 = new Object();
		
		String name1 = new String("ȫ�浿");
		String name2 = new String("ȫ�浿");
		
		String name3 = "ȫ�浿";
		String name4 = "ȫ�浿";	// String literal
		
		int x = 10;
		int y = 10;
		
//		------------------------------------object
		
		// object1, object2�� ���޸��� ���� �ּ� �� ���ϱ�.
		System.out.println(System.identityHashCode(object1));	//305808283
		System.out.println(System.identityHashCode(object2));	//2111991224
		
		boolean result = object1.equals(object2);	//false
		System.out.println("result : " + result);	
		
		result = (object1 == object2);	// ���޸��� �ּ� ���� ����.
		System.out.println("result : " + result);
		
		result = (x == y);				// ���� ����.
		System.out.println("result : " + result);
		
//		-----------------------------------name
		
		result = name1.equals(name2);	//true
		System.out.println("result : " + result);	
		
		result = (name1 == name2);	// override ���޸��� �ּ� ���� ����.
		System.out.println("result : " + result);
		
//		-----------------------------------
		
		result = name3.equals(name4);	//true
		System.out.println("result : " + result);	
		
		result = (name3 == name4);	// true
		System.out.println("result : " + result);
		// String literal�� ��� java�� ���޸𸮿� 1���� ����� ����.
	}
	
	
}
