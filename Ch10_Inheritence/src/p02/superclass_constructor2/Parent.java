package p02.superclass_constructor2;
/*
 부모 default constructor를 가급적이면 없애지 말 것.(반드시 있는 것을 권장)
  - 이유 : 자식 클래스에서 부모 default constructor를 부르지 않게 코딩 가능 하지만,
  			나중에 자식 클래스에서 새로운 constructor 만드는 등 확장석을 고려하여 필요함.
  			+) 클래스를 만들면 일단 default constructor 만드세요!
  			
 */
public class Parent {
	int homePhoneNum;
	String name;
	int age;

	public Parent() {
		System.out.println("Parent - default constructor 호출");
	}

	public Parent(int homePhoneNum) {
		this.homePhoneNum = homePhoneNum;
		
		System.out.println("Parent - Parent(int homePhoneNum) constructor 호출");
	}
	
	public void dummyParent() {
		System.out.println("parent dummyParent");
	}
}
