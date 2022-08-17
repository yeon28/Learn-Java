package p08.polymophism;

/*
 다향성(Polymorphism)의 조건
 - promotion 발생하면
   - 부모인스턴스 = 자식인스턴스 
   ex)  Parent parent = chile;
 - 부모 메소드를 자식 메소드에서 overrid한 경우만 해당함.
 - 자동형변환과 overrid 모두 충족 될 때, 부모 메소드를 실행하는 것이 아니라, overrid된 자식 메소드를 실행함.
 */
public class ChildEx {

	public static void main(String[] args) {
		Child chile = new Child();
		
		chile.method1();	//Parent
		chile.method2();	//Parent @Overrid Child --> Child에서 실행됨.
		chile.method3();	//Child
		
		System.out.println();
		
		Parent parent = chile;	// class promotion(자동형변환)
		
		parent.method1();	//Parent
		parent.method2();	//Parent @Overrid Child
//		parent.method3();	// Child	
//		--> error) 형변환실행으로 child에 있는 메소드실행은 error
		
	}

}
