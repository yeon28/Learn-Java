package p06.class_promotion;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

/*
 promotion : 직계 부모만 가능한 것이 아니라, 모든 조상이 가능함(Object 클래스까지 가능)
 */
public class PromotionEx {

	public static void main(String[] args) {

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		// promotion
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;
		
//		B b3 = e; 
//		--> error! Type mismatch: cannot convert from E to B

	}

}
