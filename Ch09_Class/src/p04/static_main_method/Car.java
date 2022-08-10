package p04.static_main_method;

public class Car {

	int speed;
	String name;
	static String color;
	

	public Car() {
		
	}

	public static void printStaticHello() {
		System.out.println("hello static method");
	}

	public void printInstanceHello() {
		speed = 5;
		System.out.println("hello Instance method");
	}

	
	
	public static void main(String[] args) {
		color = "red ";
		printStaticHello();

		Car car =new Car();
		car.speed = 10;
		car.printInstanceHello();
	}
}
