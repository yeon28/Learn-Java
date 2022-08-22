package p01.nested_class;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		
		// instance member class  인스턴스 생성
		A.B b = a.new B();
		// A class 안에 있는 B class
		b.field1 = 3;
		b.method1();
		
		// static member class 인스턴스 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		c.field2 = 5 ;
		c.method2();
		
		// local method 실행
		a.method();
	}

}
