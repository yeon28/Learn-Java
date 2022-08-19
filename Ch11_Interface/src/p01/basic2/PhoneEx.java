package p01.basic2;

public class PhoneEx {

	public static void main(String[] args) {

		Phone phone;

		phone = new ApplePhone();

		phone.sendCall();
		phone.receiveCall();

//		phone.flash();
//		--> error: The method flash() is undefined for the type Phone.
//		�θ� Ŭ�������� ������ ���� �޼ҵ� ��� �Ұ�.

//		--------------------------------------
		phone = new LgPhone();

		phone.sendCall();
		phone.receiveCall();
		
//		--------------------------------------
		phone = new SamsungPhone();

		phone.sendCall();
		phone.receiveCall();

	}

}
