package p08.practice1;

/*
 SmartPhone class
 
 부모 : PDA
 부모 인터페이스 : Mp3Interface, MobilePhoneInterface 
 */
public class SmartPhone extends PDA implements Mp3Interface, MobilePhoneInterface {

	@Override
	public void sendCall() {

		System.out.println("따르릉 따르릉!~");
	}

	@Override
	public void receiveCall() {

		System.out.println("전화왔어요!");
	}

	@Override
	public void sendSMS() {

		System.out.println("문자 보냅니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 받습니다.");
	}

	@Override
	public void paly() {
		System.out.println("음악 연주 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악 연주 중단합니다.");
	}
	
	// 필요한 메소드 추가 가능
	public void schedule() {
		System.out.println("일정관리 합니다.");
	}

}
