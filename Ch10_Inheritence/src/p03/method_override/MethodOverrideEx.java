package p03.method_override;

/*
  Method Overrides
  1. 부모 클래스의 메소드와 자식 클래스의 메소드의 시그니쳐가 동일한 경우만 해당
  2. 정의 : 부모에서 정의된 메소드가 있는대, 자식이 동일한 메소드 시그니쳐를 만들어 정의하면.
  			부모 클래스에 메소드를 호출하는 것이 아니라 자식 메소드를 호출하는 것.
 */

public class MethodOverrideEx {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.draw();

		Line line = new Line();
		line.draw();

		Rect rect = new Rect();
		rect.draw();

		Circle circle = new Circle();
		circle.draw();

	}

}
