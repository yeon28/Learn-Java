package p08.polymophism3;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v;

		Bus bus = new Bus();
		v = bus;	// promotion
		driver.driver(v);
		
		//---------------------------------
		
//		v = bus;	// promotion
//		v = new Bus(); // 위 방식과 결과가 같음
//		v = new Texi();
//		v = new Sedan();

//		driver.driver(v);
		
		//-------------------------------
		
//		Bus bus = new Bus();
		
//		driver.driver(bus);	// promotion
		
//		driver.driver(new Texi());
//		driver.driver(new Sedan());
		
	}

}
