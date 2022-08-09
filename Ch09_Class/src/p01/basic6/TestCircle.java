package p01.basic6;

public class TestCircle {

	public static void main(String[] args) {

		Circle plainPizza = new Circle();
		System.out.println("plainPizza 변수의 주소 : " + System.identityHashCode(plainPizza));
		plainPizza.printCircleInfomation();

		System.out.println();

		Circle largPizza = new Circle(12);
		System.out.println("largPizza 변수의 주소 : " + System.identityHashCode(largPizza));
		largPizza.printCircleInfomation();

		System.out.println();

		Circle superPizza = new Circle(15, "슈프림피자");
		System.out.println("superPizza 변수의 주소 : " + System.identityHashCode(superPizza));
		superPizza.printCircleInfomation();
	}
}
