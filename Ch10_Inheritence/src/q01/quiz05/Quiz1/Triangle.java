package q01.quiz05.Quiz1;

/*
 1. Triangle class 만들기
 Triangle class 만들고 테스트 하시오
 
▪ 부모 class : GeometricObject class

▪ fields
• side1, side2, side3 (private double type)

▪ constructor
• Triangle () : 생성자 안에서 side1, side2, side3의 초기값으로 1.0 설정
• Triangle (double side1, double side2, double side3)

▪ methods
• side1, side2, side3에 대한 getter method 만들기
• public double getArea() {
  - double s = (side1 + side2 + side3) / 2;
  - return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); }
• public double getPerimeter()
• public String toString() {
  - return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; }

▪ TestTriangle class
• 컨솔에서 삼각형 side1, side2, side3, color, 삼각형 filled 값 받을 것
• 2개의 constructor에 대한 parameter설정하여 Triangle 인스턴스 생성하여 
   toString(),getArea(), gerPerimeter, getColor, isFilled()를 호출하여 결과 출력
 */
public class Triangle extends GeometricObject {
	private double side1, side2, side3;

	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

//	--------------------------------getter, setter
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	// 면적
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// 둘레
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	public String toString() {
		return "side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
	}

}
