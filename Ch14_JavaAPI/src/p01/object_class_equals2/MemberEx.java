package p01.object_class_equals2;

/*
 Member class: ����ڰ� ������ Ŭ����
 - ������ ������� �Ǵ��� �� �ִ� �޼ҵ带 �����ش޶�� �䱸���� ����
   - Object class�� equals �޼ҵ带 �������̵��Ͽ� �����ϴ� ���� ���ٰ� �Ǵ���.
 */
public class MemberEx {

	public static void main(String[] args) {
		Member m1 = new Member("hong");
		Member m2 = new Member("hong");
		Member m3 = new Member("kim");

		if (m1.equals(m2)) {
			System.out.println("m1�� m2�� ������ �����");
		} else {
			System.out.println("m1�� m2�� ������ ����� �ƴ�");
		}

		if (m1.equals(m3)) {
			System.out.println("m1�� m3�� ������ �����");
		} else {
			System.out.println("m1�� m3�� ������ ����� �ƴ�");
		}

	}

}
