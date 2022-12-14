package p01.basic2;
/*
- 자식 class에서 부모 class의 필드 메소드 둘 다 사용 가능
 
- java : 1개의 부모 클래스만 상속 가능함
 	+) c++ : 여러개의 부모 클래스 상속 가능 (비추)
 */
public class ColorPoint extends Point {

	private  String  color; //점의 색
	
	public void  setColor(String color) {
		this.color = color;
		
	}
	
	public void setColorAndPoint(String color, int x, int y) {
		this.color = color;
		// 자식 class에서 부모 class의 필드 사용 가능
		this.x = x; 
		// this.x	-> 는 부모인 Point의 메소드 
		// 		x	-> 는 자식인 ColorPoint에서 선언한 메소드
		this.y = y;
	}

	public void showColorPoint() {
		System.out.print("color : " + color + ",");
		// 자식 class에서 부모 class의 메소드 사용 가능
		showPoint();
	}
	
}
