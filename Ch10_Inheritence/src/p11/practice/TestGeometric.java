package p11.practice;

public class TestGeometric {

	public static void main(String[] args) {

		Circle circle = new Circle("red", true, 3);
		
		System.out.println("Circle 전체 정보 : " + circle.toString());
		System.out.println("Circle color : " + circle.getColor());
		System.out.println("Circle radius : " + circle.getRadius());
		System.out.println("Circle area : " + circle.getArea());
		System.out.println("Circle dimeter : " + circle.getDiameter());
		
		Rectangle rectangle = new Rectangle("yellow", true, 5, 4);
		
		System.out.println("Rectangle 전체 정보 : " + rectangle.toString());
		System.out.println("Rectangle color : " + rectangle.getColor());
		System.out.println("Rectangle 높이 : " + rectangle.getHeight());
		System.out.println("Rectangle 너비 : " + rectangle.getWidth());
		System.out.println("Rectangle dimeter : " + rectangle.getDiameter());
	}

}
