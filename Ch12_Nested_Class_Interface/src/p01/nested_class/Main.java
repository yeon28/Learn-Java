package p01.nested_class;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		
		// instance member class  �ν��Ͻ� ����
		A.B b = a.new B();
		// A class �ȿ� �ִ� B class
		b.field1 = 3;
		b.method1();
		
		// static member class �ν��Ͻ� ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		c.field2 = 5 ;
		c.method2();
		
		// local method ����
		a.method();
	}

}
