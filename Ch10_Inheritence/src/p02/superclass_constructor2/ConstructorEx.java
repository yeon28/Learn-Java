package p02.superclass_constructor2;

public class ConstructorEx {

	public static void main(String[] args) {

		Child c2 = new Child(11);
		
		System.out.println("집 전화번호 : " + c2.homePhoneNum);
		
		c2.printParentInformation();
		
		Child c = new Child(); // 부모 생성자 호출
	}
}
