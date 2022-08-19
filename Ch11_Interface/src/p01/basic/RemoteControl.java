package p01.basic;

// 접근제한자가 기본적으로 public이 원칙임
public interface RemoteControl {
	// public static final int MAX_VOLUME = 10;
	int MAX_VOLUME = 10;		// 상수
	public int MIN_VOLUME = 0;	// 상수
	
	
	public abstract void turnOff();
	// public abstract void turnOn();
	void  turnOn();
	public void setVolume(int volume);
}
