package p01.basic4;

/*
 * tv클래스를 사용 --> testTv는 고객
 * tv클래스를 사용하는 고객은 대부분 메소드 사용 (필드 직접 사용하지 않음)
 */
public class TestTv {

	public static void main(String[] args) {

		Tv tv1 = new Tv(); // tv를 turnON하지 않아서 실행 안 됨
		tv1.setChannel(30);
		tv1.setVolume(2);

		tv1.turnOn();
//		tv1.channel = 20; // 고객이 필드 값을 마음대로 수정하면  클레스 내에서 메소드 등을 사용할 때 원치 않는 오작동 발생 가
		tv1.setChannel(20);
		tv1.setVolume(5);

		tv1.printTvInformation();

		Tv tv2 = new Tv();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelDown();

		tv2.printTvInformation();

		tv1.turnOff();
		tv2.turnOff();

	}

}
