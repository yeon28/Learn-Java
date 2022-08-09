package p01.basic;

//Circle c의 의미
//Circle은 클래스 이름이면서 데이터 타입임 
// -> Circle 내부에는 field인 radius가 있고 메소드인 getArea getPerimeter setRadius존재
//c, c2 : circle 인스턴스(instance)/objest를 가리키는 변수
//
//new Circle() 명령어 기계어로 변환시 순서
//- new를 실행함 : 힙메모리에 Circle 클래스의 인스턴스를 만들고 인스턴스의 힙메모리 주소를 갖음
//  - .instance 안에는 필드들만 갖고 있음. 즉, radius필드만 갖고 있음, 메소드는 힙메모리에 없음
//- Cricle 클레스의 생성자(constructor) 메소드인 public Circle()을 실행함
//- 힙 메모리에서 생성된 인스턴스주소를 스택메모리에 있는 변수 c에 넣어줌
//
//Circle class의 인스턴스인 c c2를 사용하여 Circle 클래스의 필드와 메소드를 사용

public class TestCircle {

	public static void main(String[] args) {

		Circle c = new Circle();
		
		System.out.println("Circle class 객체(인스턴스)인 c의 반지름 : " + c.radius);
		System.out.println(" Circle class 객체c의 면적 : " + c.getArea());
		System.out.println(" Circle class 객체c의 둘레 : " + c.getPerimeter());
		
		System.out.println();
		
		c.setRadius(3);
		System.out.println("Circle class 객체(인스턴스)인 c의 반지름 : " + c.radius);
		System.out.println(" Circle class 객체c의 면적 : " + c.getArea());
		System.out.println(" Circle class 객체c의 둘레 : " + c.getPerimeter());
		
		System.out.println();
		
		Circle c2 = new Circle(2);
		System.out.println("Circle class 객체(인스턴스)인 c의 반지름 : " + c2.radius);
		System.out.println(" Circle class 객체c의 면적 : " + c2.getArea());
		System.out.println(" Circle class 객체c의 둘레 : " + c2.getPerimeter());
		
		
	}

}
