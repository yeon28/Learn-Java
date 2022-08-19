package p02.anonymous_instance;

/*
 �͸�ü(anonymous instance) 
 - Interface�� implement�� �ν��Ͻ��� �ǹ���.
 - �ڽ� Ŭ������ ���������� ������ �ʰ� 1ȸ������ �ڽ� Ŭ������ ������� �� �����.
 - �ȵ���̵� ����� �� ���α׷��ֿ��� ���� �����.
 */
public class RemoteControlEx {

	public static void main(String[] args) {
	
		RemoteControl rc = new RemoteControl() {

			int volume;

			@Override
			public void turnOn() {
				System.out.println("Anonymous(�͸�)��ü - ������ �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("Anonymous(�͸�)��ü - ������ ���ϴ�.");

			}

			@Override
			public void setVolume(int volume) {

				this.volume = volume;
				System.out.println("Anonymous(�͸�)��ü Volume : " + volume);
			}
		};
	
		rc.turnOn();		// polymorphism
		rc.setVolume(7);
		rc.turnOff();
		
	}

}
