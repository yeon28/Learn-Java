package p03.method_override2;

public class Line extends Shape {

	@Override	// annotation
	public void draw() {
		System.out.println("name :  " + name);
	}
	
}
