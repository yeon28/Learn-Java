package p01.object_class_equals2;

/*
 Member class: 사용자가 정의한 클래스
 - 동일한 멤버인지 판단할 수 있는 메소드를 구현해달라는 요구사항 존재
   - Object class의 equals 메소드를 오버라이드하여 구현하는 것이 좋다고 판단함.
 */
public class MemberEx {

	public static void main(String[] args) {
		Member m1 = new Member("hong");
		Member m2 = new Member("hong");
		Member m3 = new Member("kim");

		if (m1.equals(m2)) {
			System.out.println("m1과 m2가 동일한 멤버임");
		} else {
			System.out.println("m1과 m2가 동일한 멤버가 아님");
		}

		if (m1.equals(m3)) {
			System.out.println("m1과 m3가 동일한 멤버임");
		} else {
			System.out.println("m1과 m3가 동일한 멤버가 아님");
		}

	}

}
