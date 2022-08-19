package p03.default_static_method;

/*
 - default method 선언 가능함.
   - method명 앞에 명시적으로 default라는 키워드를 넣음
   - 클래스에서는 디폴드 메소드 선언할 때 default키워드 넣지 않음
   
 - static method선언 가능
   - public static으로 인식함
   
 - 디폴트메소드와 스테틱 메소드를 인터페이스 사양에 추가한 목적은
   - 인터페이스의 확장성이 목적임.
 */
public interface RemoteControl {
	int MAX_VOLUME = 10; // 상수
	int MIN_VOLUME = 0; // 상수

	void turnOff();

	void turnOn();

	void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	static void changeBattary() {
		System.out.println("배터리를 교체합니다.");
	}
}
