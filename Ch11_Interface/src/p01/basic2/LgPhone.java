package p01.basic2;

public class LgPhone implements Phone {

	@Override
	public void sendCall() {
		System.out.println("LG Phone - ������");
	}

	@Override
	public void receiveCall() {
		System.out.println("LG Phone - ��ȭ�Խ��ϴ�.");
	}
	
	public void flash() {
		System.out.println("LG Phone - ��ȭ�⿡ ���� �������ϴ�.");
	}

}
