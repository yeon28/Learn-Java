package q06;

import q06.Quiz04_04_Car.Engine;
import q06.Quiz04_04_Car.Tire;

public class Quiz04_04_NestedClassEx {

	public static void main(String[] args) {
		Quiz04_04_Car myCar = new Quiz04_04_Car();
		
		Quiz04_04_Car.Tire tire = myCar.new Tire();
		
		Quiz04_04_Car.Engine engine = new Quiz04_04_Car.Engine();
		
	}

	
	
}
