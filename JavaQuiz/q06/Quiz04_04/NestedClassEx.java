package Quiz04_04;

import Quiz04_04.Car.Tire;
import Quiz04_04.Car.Engine;

public class NestedClassEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
		
	}

	
	
}
