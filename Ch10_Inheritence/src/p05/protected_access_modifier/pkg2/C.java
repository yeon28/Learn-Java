package p05.protected_access_modifier.pkg2;

import p05.protected_access_modifier.pkg1.A;

/*
  A 클래스와 상속 관계가 아닌 다른 패키지의 C클래스에서는 
  a클래스 프로텍으로 선언된 protected로 선언된 field constructor method 사용 불가능
 */ 
public class C extends A {
	protected String field;

	protected C() {

	}

	protected void method() {
		System.out.println("A class method");
	}
}
