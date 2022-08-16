package p02.superclass_constructor2;

/*
 1. super , this
 super : heap 메모리에 있는 Parent 클래스 인스턴스
 this : heap 메모리에 있는 자기 자신의 인스턴스
 
 2. super(homePhoneNum);
 - 부모 생성자 호출 (본인의 다른 생성자 this(...);) 
 */
public class Child extends Parent {

	public Child() {
		System.out.println("Child - default constructor 호출");
	}

	public Child(int homePhoneNum) {
//		this.homePhoneNum = homePhoneNum;
		super(homePhoneNum);
		System.out.println("Child - Child(int homePhoneNum) constructor 호출");
	}

	public void printParentInformation() {
		super.name = "아버지";
		super.age = 55;

		System.out.println("Parent name : " + name + "Parent age : " + age);
		System.out.println("Parent name : " + super.name + "Parent age : " + super.age);
		super.dummyParent();
		
	}
	
	
}
