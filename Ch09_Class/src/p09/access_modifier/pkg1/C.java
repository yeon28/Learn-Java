package p09.access_modifier.pkg1;

import p09.access_modifier.pkg1.A;

//1. 다른 패키지에서 디폴트로 선언된 필드, 컨스트럭터, 인스턴스 사용
public class C {
//	A a1 = new A();
	A a2 = new A(1);
//	A a3 = new A(1.0);
	
	public  C() {
//		a2.a =1;
		a2.b =2;
//		a2.c =3;
		
		a2.printPublic();
//		a2.printDefault();
//		a2.printPrivate();
	}
}
