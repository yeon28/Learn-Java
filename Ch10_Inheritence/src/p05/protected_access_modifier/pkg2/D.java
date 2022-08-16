package p05.protected_access_modifier.pkg2;

import p05.protected_access_modifier.pkg1.A;

/*
 1. 부모constructor가 protected로 선언된 경우 자식 클래스에서 new로 인스턴스 생성 불가
 --> 대신 super()를 통해 부모 생성자 호출 가능.
 2. protected로 선언된 필드 메소드는 자식 클래스에서 사용 가능
 */
public class D extends A {

	public  D() {
		super();
		this.field = "newValue";
		this.method();
	}
	public void method() {
//		A a = new A();
//		a.field="newValue";
//		a.method();
				
	}
}
