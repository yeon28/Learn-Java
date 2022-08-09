package p01.basic2;

public class Circle {
	double radius = 1;
	String name = "플레인피자";
//	Scanner input; // 클래스 안에 다른 클래스를 넝허 사용할 수 있음
	
	public Circle() {
		System.out.println("Circle defalt costructor 호출");
	}
	
	public Circle(double newRadius) {
		System.out.println("Circle defalt(double newRadius) costructor 호출");
		radius = newRadius;
	}
	
	public Circle(String newName) {
		name = newName;
	}
	
	public Circle(double newRadius, String newName) {
		radius = newRadius;
		name = newName;
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
