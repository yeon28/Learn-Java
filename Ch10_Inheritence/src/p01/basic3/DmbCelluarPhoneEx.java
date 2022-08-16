package p01.basic3;

public class DmbCelluarPhoneEx {

	public static void main(String[] args) {

		DmbCelluarPhone dmb = new DmbCelluarPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + dmb.model);
		System.out.println("모델 : " + dmb.color);
		System.out.println("모델 : " + dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요");
		dmb.sendVoice("예, 반갑습니다.");
		dmb.hangUp();
		
		dmb.turnOnDmb();
		dmb.changeChannel(12);
		dmb.turnOffDmb();
		
		
		
		
	}

}
