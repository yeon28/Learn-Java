package p03.method_override2;

/*
<Method Overrides>
  자식 클래스를 사용하는 다른 클래스에서는
  override된 메소드나 부모와 자식에서 동일한 이름으로 만들 필드를 직접 호출하기 불가능
 */

public class MethodOverrideEx {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.draw();

		Line line = new Line();
		line.draw();

		Rect rect = new Rect();
		rect.name = "Rect_Name";
		rect.draw();

		Circle circle = new Circle();
		circle.draw();

	}

}
