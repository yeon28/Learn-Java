package p01.basic2;

public class ApplePhone implements Phone {

	@Override
	public void sendCall() {
		System.out.println("Apple Phone - ������");
	}

	@Override
	public void receiveCall() {
		// �ٸ� Ŭ�������� Interface�� ������ �ڽ� Ŭ������ �θ��� interface�� �ڵ�����ȯ�Ͽ� ����� ���,
		// �ڽ� Ŭ�������� ���� �߰��� �޼ҵ�� ���� ����� �� ����
		// interface���� override�� �ڽ� Ŭ������ �޼ҵ� �ȿ� ���������� ����ϴ� ���� ���� 
		flash();
		System.out.println("Apple Phone - ��ȭ�Խ��ϴ�.");
	}

	public void flash() {
		System.out.println("Apple Phone - ��ȭ�⿡ ���� �������ϴ�.");
	}

}
