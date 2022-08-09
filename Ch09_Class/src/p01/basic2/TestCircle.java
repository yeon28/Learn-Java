package p01.basic2;

public class TestCircle {
	/*
	 * 자바 클래스는 메인 메소드가 있는 클래스와 메인 메소드가 없는 클래스로 구분 가능함.
	 * 
	 * 자바 프로그래밍르 한다는 말은 - 1개의 매인 메소드가 있는 클래스+메인메소드가 없는 여러개의 클래스들 - 메인 메소드가 있는 클래스는
	 * 메인 메소드가 없는 클레스 들을 사용 - 메인 메소드가 없는 클래스 들을 메인 메소드가 없는 다른 클래스들을 사용할 수 있음
	 * 
	 * 메인 메소드가 없는 클래스 들을 일반적으로 자바 라이브러리 라고 부름 - 자바 에서 기본적으로 제공하는 라이브러리 : scanner
	 * system ... - jsp spring에서 제공하는 웹프로그래밍 클래스 라이브러리 - 자바 개발자가 만든 클래스들 -->클래스
	 * 라이브러리
	 * 
	 * 클래스 하나가 OOP 객체 지향 프로그래밍의 하나의 객제를 의미함
	 * 
	 */
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "플레인피자");
		double area = pizza.getArea();

		System.out.println(pizza.name + "의 면적 : " + area);

		// 슈프림피자 반지름 12
		pizza.radius = 12;
		pizza.name = "슈프림피자";
		System.out.println(pizza.name + "의 면적 : " + area);

		Circle pineApplePizza = new Circle(11, "파인에플피자");
		area = pineApplePizza.getArea();
		System.out.println(pineApplePizza.name + "의 면적 : " + area);

		Circle dounut = new Circle(5, "도넛");
		area = dounut.getArea();
		System.out.println(dounut.name + "의 면적 : " + area);


	}

}
