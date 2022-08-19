package p03.default_static_method;


public class RemoteControlEx {

	public static void main(String[] args) {

		RemoteControl rc;
		
		rc = new Television();	// promotion
		rc.turnOn();			// polymorphism
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();

		RemoteControl.changeBattary();
		
		rc = new Audio();		// promotion
		rc.turnOn();			// polymorphism
		rc.setVolume(7);
		rc.setMute(false);
		rc.turnOff();

	
	}

}
