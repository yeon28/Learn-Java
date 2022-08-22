package p01.nested_class;

public class A {
	int f1;
	static int f2;

	public A() {
		System.out.println("A �ν��Ͻ� ����");
	}

	// instance member class
	class B {
		int field1;
//		static int field2;
//		--> instance member class���� static field ���� �Ұ�

		public B() {
			System.out.println("B instance member class �ν��Ͻ� ����");
		}

		void method1() {
			System.out.println("B class field1 : " + field1);
		}
//		static void method2() {}
//		--> instance member class���� static class ���� �Ұ�
	}

	// static member class
	static class C {

		int field1;
		static int field2 = 10;

		public C() {
			System.out.println("C instance member class �ν��Ͻ� ����");
		}

		void method1() {
			System.out.println("C method1 class field1 : " + field1);
		}

		static void method2() {
			System.out.println("C method2 class field1 : " + field2);
		}

	}

	// class A�� instance method
	void method() {
		int f1;// local variable
//		static final int f2 = 0;
		class D {
			int field1;
//			static int field2;
			
			public D() {
				System.out.println("D instance member class �ν��Ͻ� ����");
			}
			
			void method1() {
				System.out.println("local class field1 : " + field1);
			}
//			static void method2() {}
		}
		
		D d = new D();
//		--> �޼ҵ峻���� ����� ���� Ŭ������ ����� �� �ִ� ���� �޼ҵ� ���ο����� �����ϰ� 
//		�޼ҵ� ���ο��� new �ν��Ͻ� �����ؼ� ����ؾ� ��.
		d.field1 = 3;
		d.method1();
	}
}
