package p04.polymorphism2;

public class DriverEx {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus);
		driver.driver(taxi);
		
	}

}
