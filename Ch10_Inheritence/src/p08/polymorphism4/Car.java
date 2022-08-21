package p08.polymorphism4;

public class Car {
	
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("자동차가 달립니다.");
		
		//override된 자식 roll() method 실행 (polymorphism)
		if (frontLeftTire.roll() == false) {	// 앞 왼쪽 바퀴가 펑크가 난 경우
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {	// 앞 오른쪽 바퀴가 펑크가 난 경우
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {		// 뒤 왼쪽 바퀴가 펑크가 난 경우
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {	// 뒤 오른쪽 바퀴가 펑크가 난 경우
			stop();
			return 4;
		}
		return 0;
		
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
