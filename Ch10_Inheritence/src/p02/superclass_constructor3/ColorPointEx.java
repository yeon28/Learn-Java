package p02.superclass_constructor3;

public class ColorPointEx {

	public static void main(String[] args) {

		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.serColorAndPoint("red", 3, 4);
//		cp.setColor("red");
//		cp.set(3, 4);
		cp.showColorPoint();
		
		ColorPoint cp1 = new ColorPoint();
		cp1.setColor("yellow");
		cp1.showColorPoint();
		
		ColorPoint cp2 = new ColorPoint();
		cp2.showColorPoint();
		
	}

}
