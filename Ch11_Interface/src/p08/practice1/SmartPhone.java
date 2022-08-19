package p08.practice1;

/*
 SmartPhone class
 
 �θ� : PDA
 �θ� �������̽� : Mp3Interface, MobilePhoneInterface 
 */
public class SmartPhone extends PDA implements Mp3Interface, MobilePhoneInterface {

	@Override
	public void sendCall() {

		System.out.println("������ ������!~");
	}

	@Override
	public void receiveCall() {

		System.out.println("��ȭ�Ծ��!");
	}

	@Override
	public void sendSMS() {

		System.out.println("���� �����ϴ�.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���� �޽��ϴ�.");
	}

	@Override
	public void paly() {
		System.out.println("���� ���� �մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("���� ���� �ߴ��մϴ�.");
	}
	
	// �ʿ��� �޼ҵ� �߰� ����
	public void schedule() {
		System.out.println("�������� �մϴ�.");
	}

}
