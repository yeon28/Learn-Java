package p08.polymophism2;

public class Shape {
	String name = "Shape";
	
	public void paint() {
		draw();
	}
	
	public void draw() {
		System.out.println("name :  " + name);
	}
}
