package p02.superclass_constructor;

public class Parent {
	int homePhoneNum;
	
	public  Parent() {
		System.out.println("Parent - default constructor 호출");
	}
	
	public  Parent(int homePhoneNum) {
		this.homePhoneNum = homePhoneNum;
		System.out.println("Parent - Parent(int homePhoneNum) constructor 호출");
	}
}
