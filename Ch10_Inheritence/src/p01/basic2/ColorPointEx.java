package p01.basic2;

public class ColorPointEx {

	public static void main(String[] args) {

		Point p = new Point();	// Point객체 생성
		
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); 	// ColorPoint객체 생성
		
		cp.setColorAndPoint("red", 3, 4);	
		// Point에서 setColorAndPoint() 호출
		// 위아래 방식 모두 결과 동일함.
		//  Point에서 setColor()와 ColorPoint에서 set()호츨
		cp.setColor("red");
		cp.set(3, 4);	
		
		cp.showColorPoint();
	}

}
