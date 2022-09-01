package q06;

/*
 1. Square class 만들기.
Square class 만들고 테스트 하시오

▪ 부모 class : GeometricObject class

▪ constructor
• public Square() : 생성자 안에서 side의 초기값으로 1.0 설정
• public Square(double side) : 생성자 안에서 color=“black”, filled=false로 설정
• public Square(double side, String color, boolean filled)

 */
public class Quiz01_GeometricObject {
	public String color;
	public boolean filled;

	public Quiz01_GeometricObject() {

	}

	public Quiz01_GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	@Override
	public String toString() {
		return ("\nColor : " + color + "\nFilled : " + filled);
	}

}
