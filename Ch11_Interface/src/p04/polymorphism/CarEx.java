package p04.polymorphism;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run();	// 한국 타이어가 굴러갑니다 출력
		
		System.out.println();
		
		// 한국 타이어를 금호 타이어로 바꿈
		car.frontLeftTire = new KumhoTire(); 
		car.frontRightTire = new KumhoTire();
		car.backLeftTire = new KumhoTire();
		car.backRightTire = new KumhoTire();
		
		car.run();	// 금호 타이어가 굴러갑니다 출력
	}

	
}
