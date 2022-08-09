package p01.basic6;

/*
 * this 
 * - 힙메모리에서 생성된 인스턴스를 가리키느 주소를 갖고 있음
 * - 클래스 내부에서만 생성됨.
 * - plainPizza largPizza처럼 힙메모리에 생성된 변수에 대하여 this는 고정된 것이 아니라 사용하는 인스턴스 변수에 따라 바뀜.
 * 
 *   - plainPizza.setRadius(5); largPizza.setRadius(10);라면,
 *   setRadius메소드 본문 안에 this.radius = newRadius; 명령어가 있을 때
 *    --> plainPizza를 사용할 경우에는 this는 plainPizza이고 
 *   		largPizza를 사용할 경우에는 this는 largPizza임. 
 */
public class Circle {
	double radius = 1;
	String name = "플레인피자";
	int price;

	public Circle(int price) {
		this.price = price;
	}

	public Circle() {
		System.out.println("Circle() this실행 : " + System.identityHashCode(this));
	}

	public Circle(double radius) {
		System.out.println("Circle(double newRadius) this실행 : " + System.identityHashCode(this));
		this.radius = radius;
	}

	public Circle(String name) {
		this.name = name;
	}

	public Circle(double radius, String name) {
		System.out.println("Circle(double newRadius, String newName) this실행 : " + System.identityHashCode(this));
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
		System.out.println("name : " + this.name + "radius : " + this.radius);
	}

}
