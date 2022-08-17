package p08.polymophism2;

public class Circle extends Shape {
	String name;
	
	public Circle(String name) {
		this.name = name;
	}
	@Override
	public void draw() {
		System.out.println("name :  " + name);
	}
	
}
