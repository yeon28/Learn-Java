package p03.method_override;

public class Rect extends Shape {
	
	@Override	// annotation
	public void draw() {
		System.out.println("Rect class - draw()");
	}
	
}
