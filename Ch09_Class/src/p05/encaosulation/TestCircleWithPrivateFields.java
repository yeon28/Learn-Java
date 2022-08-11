package p05.encaosulation;

public class TestCircleWithPrivateFields {

	public static void main(String[] args) {

		Circle circle = new Circle(5.0);

//		circle.radius = 10;
//		circle.name = "홍길동";
//		circle.getNumberObjects = 10;
//		circle.printPivateHello();
		// Circle class에서 프라이빗으로 선언된 필드, 메소드는 사용 불가

		System.out.println("circle radius : " + circle.getRadius() + ", area : " + circle.getArea() + ", 생성된 인스턴스 : "
				+ circle.getNumberObjects());

		circle.setRadius(20);

		System.out.println("circle radius : " + circle.getRadius() + ", area : " + circle.getArea() + ", 생성된 인스턴스 : "
				+ circle.getNumberObjects());

	}

}
