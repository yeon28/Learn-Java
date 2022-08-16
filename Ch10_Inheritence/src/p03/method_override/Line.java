package p03.method_override;

public class Line extends Shape {

	@Override	// annotation
	public void draw() {
		System.out.println("Line class - draw()");
	}
	
}
