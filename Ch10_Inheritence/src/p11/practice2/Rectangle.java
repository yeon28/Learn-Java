package p11.practice2;

public class Rectangle extends GeometricObject {
	private double width;
	private double height;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double width, double heigh) {
		this.height = heigh;
		this.width = width;
	}

	public Rectangle(String color, boolean filled, double width, double heigh) {
		super(color, filled);
		this.height = heigh;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getDiameter() {
		return 2 * (this.width * this.height);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", width : " + this.width + ", height" + this.height;
	}

}
