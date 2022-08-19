package p05.casting;

/*
 부모가 Interface 타입인 경우라도 casting할 때, instanceof 사용 가능
 */
public class DriverEx {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();	// promotion
		
		vehicle.run();
		
//		vehicle.checkFare();
//		--> error : The method checkFare() is undefined for the type Vehicle
//		 형변환이 되지 않아서 오류
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;	// casting
			bus.checkFare();
		} 
	}

}
