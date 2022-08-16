package p02.superclass_constructor;

public class Child extends Parent {

	public  Child() {
		System.out.println("Child - default constructor 호출");
	}
	
	public  Child(int homePhoneNum) {
		this.homePhoneNum = homePhoneNum;
		System.out.println("Child - Child(int homePhoneNum) constructor 호출");
	}
}
