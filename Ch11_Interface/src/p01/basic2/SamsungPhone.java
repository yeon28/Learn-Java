package p01.basic2;

public class SamsungPhone implements Phone {

	@Override
	public void sendCall() {
		System.out.println("Samsung Phone - ������");
	}

	@Override
	public void receiveCall() {
		System.out.println("Samsung Phone - ��ȭ�Խ��ϴ�.");
	}
	
	public void flash() {
		System.out.println("Samsung Phone - ��ȭ�⿡ ���� �������ϴ�.");
	}

}
