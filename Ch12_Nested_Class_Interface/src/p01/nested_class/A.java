package p01.nested_class;

public class A {
	int f1;
	static int f2;

	public A() {
		System.out.println("A 인스턴스 생성");
	}

	// instance member class
	class B {
		int field1;
//		static int field2;
//		--> instance member class에서 static field 선언 불가

		public B() {
			System.out.println("B instance member class 인스턴스 생성");
		}

		void method1() {
			System.out.println("B class field1 : " + field1);
		}
//		static void method2() {}
//		--> instance member class에서 static class 선언 불가
	}

	// static member class
	static class C {

		int field1;
		static int field2 = 10;

		public C() {
			System.out.println("C instance member class 인스턴스 생성");
		}

		void method1() {
			System.out.println("C method1 class field1 : " + field1);
		}

		static void method2() {
			System.out.println("C method2 class field1 : " + field2);
		}

	}

	// class A의 instance method
	void method() {
		int f1;// local variable
//		static final int f2 = 0;
		class D {
			int field1;
//			static int field2;
			
			public D() {
				System.out.println("D instance member class 인스턴스 생성");
			}
			
			void method1() {
				System.out.println("local class field1 : " + field1);
			}
//			static void method2() {}
		}
		
		D d = new D();
//		--> 메소드내에서 선언된 로컬 클래스를 사용할 수 있는 곳은 메소드 내부에서만 가능하고 
//		메소드 내부에서 new 인스턴스 생성해서 사용해야 함.
		d.field1 = 3;
		d.method1();
	}
}
