package p03.method_override;

/*
  Method Overrides
  부모 메소드를 호출하더라도 자식 클래스에서 오버라이드된 메소드가 존재하면, 자식 메소드를 호출함.
  
 */

public class MethodOverrideEx2 {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.paint();// 부모 메소드의 paint 호출

		Line line = new Line();
		line.paint();
		df

		Rect rect = new Rect();
		rect.paint();

		Circle circle = new Circle();
		circle.paint();

		
	}

}
