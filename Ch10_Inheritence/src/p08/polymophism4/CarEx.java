package p08.polymophism4;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 0; i <= 5; i++) { // 5회 실행
			int problemLocation = car.run();	// 0,1,2,3,4
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);	// promotion 발생
				break;
			case 2:
				System.out.println("앞왼쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);	// promotion 발생
				break;
			case 3:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);		// promotion 발생
				break;
			case 4:
				System.out.println("앞왼쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);	// promotion 발생
				break;
			}
			System.out.println("------------------------------------");
		}
	}

}
