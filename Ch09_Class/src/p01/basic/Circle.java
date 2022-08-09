package p01.basic;

//클래스 이름 : Circle(첫글자는 대문자)
//- field(속성) : radius
//- constructor(생성자): Circle() Circle(double newRadius)
//  - 생성자 이름과 클래스 이름은 동일함
//  - 생성자는 특수한 경우에 사용하는 메소드 
//    (생성자는 new Cricle()같은 방식으로 힙메모리에 인스턴스 만들 때, 자바 내부적으로 한 번만 사용함)
//  - 생성자 오버로딩 : 메소드 오버로딩과 같은 개념임
//  - 클래스 내에 생성자는 여러개 만들어 질 수 있음
//- class method : getArea() getPerimeter() setRadius(double newRadius)

  
public class Circle {
	double radius = 1;
	
	public Circle() {
		System.out.println("Circle defalt costructor 호출");
	}
	
	public Circle(double newRadius) {
		System.out.println("Circle defalt(double newRadius) costructor 호출");
		radius = newRadius;
	}
	
//	생성자 위
//-------------------------------------------------------------------
//	메소드 아래
	
	// 원의 면적 구하는 메소드
	public double getArea() {
		return radius*radius*Math.PI;
	}
	// 원의 둘레를 구하는 메소드
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

}
