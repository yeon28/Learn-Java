package q01.quiz04;
/*
Rectangle class 만들기

Rectangle class 만들고 테스트 하시오

- fields
double type으로 width, height 선언 (둘 다 초기값 1)

- constructor
default constructor만 생성

- methods
public double getArea(), public double getPerimeter() 만들기

TestRectangle class
- 2개 Rectangle 인스턴스 만들기 (1개는 width 4, height 40이고, 2번째는 width 3.5, height 35.9 만들기)
- 2개 인스턴스의 정보 출력하기 (width, height, area, perimeter)

*/
public class Quiz03_TestRectangle {

	public static void main(String[] args) {
		
		Quiz03_Rectangle rectangle1 = new Quiz03_Rectangle();
		
		rectangle1.width = 4;
		rectangle1.height =40;
		
		System.out.println("rectangle1의 너비 : " + rectangle1.width );
		System.out.println("rectangle1의 높이 : " + rectangle1.height );
		System.out.println("rectangle1의 넓이 : " + rectangle1.getArea() );
		System.out.println("rectangle1의 둘레 : " + rectangle1.getPerimeter() );
		
		System.out.println("---------------------------------------");
		
		Quiz03_Rectangle rectangle2 = new Quiz03_Rectangle();
		
		rectangle2.width = 3.5;
		rectangle2.height =35.9;
		
		System.out.println("rectangle2의 너비 : " + rectangle2.width );
		System.out.println("rectangle2의 높이 : " + rectangle2.height );
		System.out.println("rectangle2의 넓이 : " + rectangle2.getArea() );
		System.out.println("rectangle2의 둘레 : " + rectangle2.getPerimeter() );
		
		
	}

}
