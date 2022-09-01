package q04;

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

public class Quiz03_Rectangle {
	double width = 1;
	double height = 1;
	
	public Quiz03_Rectangle(){
		//default constructor만 생성
	}
	
//	----------------------------method
	
	public double getArea() {
		return width*height;
		
	}
	
	public double getPerimeter() {
		return (width*2)+(height*2);
	}
		

}
