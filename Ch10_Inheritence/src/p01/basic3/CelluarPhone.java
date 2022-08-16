package p01.basic3;

public class CelluarPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨을 울립니다.");
	}
	
	
	void sendVoice(String message) {
		System.out.println("본인 : "+ message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대 : "+ message);
	}
	
	void hangUp() {
		System.out.println("전호를 끊습니다.");
	}
}
