package p11.practice;

public class Circle extends GeometricObject {
	private double radius;
	
	public Circle() {
	
	}
	
	public Circle( double radius) {
		this.radius = radius;
	}
	
	public  Circle(String color, boolean filled, double radius ) {
		super(color, filled);
		this.radius = radius;

	}
	

	
	public double getRadius() {
		return radius;
	}
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 원면적
	public double getArea() {
		return(Math.PI * this.radius* this.radius );
	}
	
	public double getDiameter() {
		return(2 * this.radius);
	}
	
	//원둘래
	public double getPerimeter() {
		return(2*Math.PI * this.radius);
	}
	
	public void printCircle() {
		System.out.println("Circle createdDate : " + getDateCreated() + ", radius : " + this.radius);
	}
	
	@Override
	public String toString() {
		return super.toString() +", radius : " + this.radius;
	}
}	
