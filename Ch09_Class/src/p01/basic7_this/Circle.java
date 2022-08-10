package p01.basic7_this;

/*
 * this는 컨스트럭터 메소드를 의미함.Circle(double radius, String name) 를 호출함.
 * 
 * 사용목적은 컨스트럭터마다 반복적으로 입력값을 체크하는 등 중복 코딩을 막을 수 있음.
 * 
 */
public class Circle {
	double radius;
	String name;
	
	
	public Circle() { // 값이 없을 때, 초기값 설
//		double radius = 1;
//		String name = "플레인피";
		this(1,"플레인피"); //this는 constructor를 의미
		System.out.println("end of Default Constructor call");
	}	
	

	public Circle(double radius) {
//		this.radius = radius;
//		this.name = "플레인피";
		this(radius,"플레인피");
		System.out.println("Circle(double radius) call");
	}

	public Circle(String name) {
//		this.name = name;
		this(1,name);
	}

	public Circle(double radius, String name) {
		System.out.println("Circle(double radius, String name) call");
		// formal파라미터의 입력값이 유효한지 체크하는 로직이 코딩해야함.
		if(radius >0) {
			this.radius = radius;
			
		}else {
			this.radius = 1;
		}
		this.radius = radius;
		this.name = name;
	}

//	
//-------------------------------------------------------------------
//	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public void setRadius(double radius) {
		radius = this.radius;
	}

	public void printCircleInfomation() {
		System.out.println("name : " + this.name + ", radius : " + this.radius);
	}

}
