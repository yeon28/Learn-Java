package p01.basic;

// ���������ڰ� �⺻������ public�� ��Ģ��
public interface RemoteControl {
	// public static final int MAX_VOLUME = 10;
	int MAX_VOLUME = 10;		// ���
	public int MIN_VOLUME = 0;	// ���
	
	
	public abstract void turnOff();
	// public abstract void turnOn();
	void  turnOn();
	public void setVolume(int volume);
}
