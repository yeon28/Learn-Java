package Quiz01;

/*
 1. Square class 만들기.
Square class 만들고 테스트 하시오

▪ 부모 class : GeometricObject class

▪ Implements할 interface : Colorable
• 추상 메소드 : String howToColor();

▪ fields
• side (private double type)

▪ constructor
• public Square() : 생성자 안에서 side의 초기값으로 1.0 설정
• public Square(double side) : 생성자 안에서 color=“black”, filled=false로 설정
• public Square(double side, String color, boolean filled)

▪ methods
• side에 대한 getter/setter method 만들기
• public double getArea(), public double getPerimeter()
• public String howToColor() : “모든 변을 색칠하기” 문자열 return
• public String toString() {
	- return “super.toString() + "\nSide: " + side + "\nArea: " + getArea() + "\nPerimeter: "+ getPerimeter()

▪ TestSquare class
• 컨솔에서 사각형 side, color, filled 값 받을 것
• 3개의 constructor에 대한 parameter설정하여 Square 인스턴스 생성하여 toString() 호출하여 결과 출력
 */
public class Square extends GeometricObject implements Colorable {
	private double side;

	public Square() {
		side = 1.0;
	}

	public Square(double side) {
		super("black", false);
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		return (side*side) ;
	}

	public double getPerimeter() {
		return (side* 4);
	}

	@Override
	public String howToColor() {
		return "모든 변을 색칠하기.";
	}

	@Override
	public String toString() {
		return (super.toString() + "\nSide: " + side + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter());

	}

}
