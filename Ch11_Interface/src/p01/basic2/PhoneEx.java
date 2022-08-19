package p01.basic2;

public class PhoneEx {

	public static void main(String[] args) {

		Phone phone;

		phone = new ApplePhone();

		phone.sendCall();
		phone.receiveCall();

//		phone.flash();
//		--> error: The method flash() is undefined for the type Phone.
//		부모 클래스에서 만들지 않은 메소드 사용 불가.

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
