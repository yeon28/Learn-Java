package q01.quiz05.Quiz1;

/*
 1. Triangle class 만들기
 Triangle class 만들고 테스트 하시오

▪ TestTriangle class
• 컨솔에서 삼각형 side1, side2, side3, color, 삼각형 filled 값 받을 것
• 2개의 constructor에 대한 parameter설정하여 Triangle 인스턴스 생성하여 
   toString(),getArea(), gerPerimeter, getColor, isFilled()를 호출하여 결과 출력
 */

public class TestTriangle {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle("red", true, 10, 10, 10);
		
		System.out.println("Triangle 정보 : " + triangle.toString());
		System.out.println("Triangle 면적 : " + triangle.getArea());
		System.out.println("Triangle 둘레 : " + triangle.getPerimeter());
		System.out.println("Triangle 색상 : " + triangle.getColor());
		System.out.println("Triangle  : " + triangle.isFilled());
		
	}

}
