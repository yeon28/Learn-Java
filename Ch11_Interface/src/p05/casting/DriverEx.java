package p05.casting;

/*
 �θ� Interface Ÿ���� ���� casting�� ��, instanceof ��� ����
 */
public class DriverEx {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();	// promotion
		
		vehicle.run();
		
//		vehicle.checkFare();
//		--> error : The method checkFare() is undefined for the type Vehicle
//		 ����ȯ�� ���� �ʾƼ� ����
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;	// casting
			bus.checkFare();
		} 
	}

}
