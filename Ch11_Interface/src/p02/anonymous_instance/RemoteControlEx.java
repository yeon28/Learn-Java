package p02.anonymous_instance;

/*
 익명객체(anonymous instance) 
 - Interface를 implement한 인스턴스를 의미함.
 - 자식 클래스를 공식적으로 만들지 않고 1회성으로 자식 클래스를 만들기할 때 사용함.
 - 안드로이드 모바일 앱 프로그래밍에서 많이 사용함.
 */
public class RemoteControlEx {

	public static void main(String[] args) {
	
		RemoteControl rc = new RemoteControl() {

			int volume;

			@Override
			public void turnOn() {
				System.out.println("Anonymous(익명)객체 - 전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Anonymous(익명)객체 - 전원을 끕니다.");

			}

			@Override
			public void setVolume(int volume) {

				this.volume = volume;
				System.out.println("Anonymous(익명)객체 Volume : " + volume);
			}
		};
	
		rc.turnOn();		// polymorphism
		rc.setVolume(7);
		rc.turnOff();
		
	}

}
