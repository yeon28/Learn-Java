package p03.default_static_method;

/*
 - default method ���� ������.
   - method�� �տ� ��������� default��� Ű���带 ����
   - Ŭ���������� ������ �޼ҵ� ������ �� defaultŰ���� ���� ����
   
 - static method���� ����
   - public static���� �ν���
   
 - ����Ʈ�޼ҵ�� ����ƽ �޼ҵ带 �������̽� ��翡 �߰��� ������
   - �������̽��� Ȯ�强�� ������.
 */
public interface RemoteControl {
	int MAX_VOLUME = 10; // ���
	int MIN_VOLUME = 0; // ���

	void turnOff();

	void turnOn();

	void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}

	static void changeBattary() {
		System.out.println("���͸��� ��ü�մϴ�.");
	}
}
