package p08.polymophism2;

public class Line extends Shape {

	public Line(String name) {
		this.name = name;
	}
	@Override
	public void draw() {
		System.out.println("name :  " + name);
	}
	
}
