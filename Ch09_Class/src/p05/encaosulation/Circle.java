package p05.encaosulation;

public class Circle {
	private double radius = 1;
	private String name;
	private static int numberObjects = 0;

	public Circle() {
		this.radius = 1;
		numberObjects++;
	}

	public Circle(double newRadius) {
		this.radius = newRadius;
		numberObjects++;
	}

	// getter method
	public double getRadius() {
		return radius;
	}

	// setter method
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}

	// getter method
	public static int getNumberObjects() {
		return numberObjects;
	}

	// 원의 면적 구하는 메소드 선
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// 원의 둘레 구하는 메소드 선
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	private void printPrivateHello() {
		System.out.println("hello private method");
	}

}
