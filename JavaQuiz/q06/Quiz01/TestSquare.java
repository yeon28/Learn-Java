package Quiz01;

import java.util.Scanner;

/*
 1. Square class 만들기.
Square class 만들고 테스트 하시오

▪ TestSquare class
• 컨솔에서 사각형 side, color, filled 값 받을 것
• 3개의 constructor에 대한 parameter설정하여 Square 인스턴스 생성하여 toString() 호출하여 결과 출력
 */
public class TestSquare {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("사각형의 side, color, filled 값을 순서대로 입력하세요.");
		
		Square sq = new Square();
		
		sq.setSide(input.nextDouble());
		sq.setColor(input.next());
		sq.setFilled(input.nextBoolean());
		
		System.out.println(sq.toString());
		
	}

}
