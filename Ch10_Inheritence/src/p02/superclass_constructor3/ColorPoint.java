package p02.superclass_constructor3;

public class ColorPoint extends Point {

	private  String  color;
	
	public ColorPoint() {	}
	
	public ColorPoint(int x, int y) { 
		super(x,y);
	}
	public ColorPoint(String color,int x, int y) { 
		super(x,y);
		this.color = color;
	}
	
	public void  setColor(String color) {
		this.color = color;	
	}
	
	public void serColorAndPoint(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public void showColorPoint() {
		System.out.print("color : " + color + ",");
		showPoint();
		super.showPoint();
	}
	
}
