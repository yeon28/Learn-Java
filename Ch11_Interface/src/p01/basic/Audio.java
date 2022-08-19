package p01.basic;

/*
 Audio class´Â RemoteControl ÀÎÅÍÆäÀÌ½º¯M ÀÚ½Ä Å¬·¡½ºÀÓ.
 RemoteControl ÀÎÅÍÆäÀÌ½º´Â Audio Å¬·¡½ºÀÇ ºÎ¸ð Å¬·¡½ºÀÓ.
 */
public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume <= RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç Audio Volume : " + this.volume);
	}

}
