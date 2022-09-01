package q05;

public class Quiz04_MoveCall {

	public static void main(String[] args) {

		Quiz04_Car car = new Quiz04_Car();
		Quiz04_Plane plane = new Quiz04_Plane();
		Quiz04_VehicleUse vehicleUse = new Quiz04_VehicleUse();
		vehicleUse.getMoveStyle(car);
		vehicleUse.getMoveStyle(plane);
	}

}
