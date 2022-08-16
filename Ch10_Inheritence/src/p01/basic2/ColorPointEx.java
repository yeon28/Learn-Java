package p01.basic2;

public class ColorPointEx {

	public static void main(String[] args) {

		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		
		cp.serColorAndPoint("red", 3, 4);
		// 위아래 결과 동일함.
		cp.setColor("red");
		cp.set(3, 4);
		
		cp.showColorPoint();
	}

}
