package p08.polymophism2;

public class Rect extends Shape {
	String name;
	
	public Rect(String name) {
		this.name = name;
	}
	
	@Override
	public void draw() {
		System.out.println("name :  " + name);
	}
	
}
