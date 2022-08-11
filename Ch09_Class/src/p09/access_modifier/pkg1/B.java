package p09.access_modifier.pkg1;

public class B {
	A a1= new A();		// default constructor 호출
	A a2 = new A(1);	// public constructor 호출
//	A a3 = new A(1.0);	// private constructor 호출
	
	public  B() {
		a1.a =1; 		// default field 호출
		a1.b =2; 		// public field 호출
//		a1.c = 3; 		// private field 호출 --> 프라이빗 사용 에러
		
		a1.printDefault();
//		a1.printPrivate();
		a1.printPublic();
	}
 	
	
}
