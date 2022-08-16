package p03.method_override;

public class Circle extends Shape {

	@Override	// annotation
	public void draw() {
		System.out.println("Circle class - draw()");
	}
	
}
