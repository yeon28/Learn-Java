package p04.polymorphism;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run();	// �ѱ� Ÿ�̾ �������ϴ� ���
		
		System.out.println();
		
		// �ѱ� Ÿ�̾ ��ȣ Ÿ�̾�� �ٲ�
		car.frontLeftTire = new KumhoTire(); 
		car.frontRightTire = new KumhoTire();
		car.backLeftTire = new KumhoTire();
		car.backRightTire = new KumhoTire();
		
		car.run();	// ��ȣ Ÿ�̾ �������ϴ� ���
	}

	
}
