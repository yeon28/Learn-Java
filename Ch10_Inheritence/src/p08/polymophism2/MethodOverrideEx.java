package p08.polymophism2;

/*
 polymorphism 사용 방법
 1. 부모 자식 클래스 만들고 method override 시킴.
 2. 부모로 promotion시켜서 override된 method위주로 코딩함.
 
 polymorphism 사용 목적
 - 소스코드를 재사용하기 위해서 사용함.
 - 소스코드를 수정할 경우에 수정 최소화 할 수 있음.
 */
public class MethodOverrideEx {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[3];

		// promotion
		shapes[0] = new Line("Lines");
		shapes[1] = new Rect("Rects");
		shapes[2] = new Circle("Circles");

		for (int i = 0; i < shapes.length; i++) {
//			shapes[i].draw();	// draw()는 override된 메소드
			shapes[i].paint();	// paint()는 draw()
		}
	}

}
