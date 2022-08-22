package p03.anonymous_class;
/*
 �θ� Ŭ������ �ڽ� Ŭ���� ������ �ڽ� Ŭ������ �͸�ü�� ����� �θ� Ŭ���� Ÿ������  promotion�Ͽ� ��� ����
 */
public class AnonyClassEx {

	public static void main(String[] args) {
		AnonyClass ac = new AnonyClass();
		
		ac.person.wake(); // AnonyClass() �ȿ� person�� wake() ����
		
		ac.method1();
		
		// �ڽ� �͸� ��ü�� method2�� �Ķ���ͷ� �ѱ�.
		ac.method2(new Person() {
			void study() {
				System.out.println("���θ� �մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("9�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}
}
