package p01.basic7_this;

public class TestCircle {

	public static void main(String[] args) {

		Circle plainPizza = new Circle();
		plainPizza.printCircleInfomation();

		System.out.println();

		Circle largPizza = new Circle(12);
		largPizza.printCircleInfomation();

		System.out.println();

		Circle superPizza = new Circle(15, "슈프림피자");
		superPizza.printCircleInfomation();
	}
}
