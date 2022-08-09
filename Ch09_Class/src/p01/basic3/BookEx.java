package p01.basic3;

/*
 * 다른 클래스를 사용할 때 주고 클래스를 메소드로 사용하고, 필드는 사용하지 않는 것이 원칙
 * - 예, Book클래스에 타이틀 어써 필드를 직접 사용하는 것 대신에
 *   프린트북인포() 메소드를황요하여 사용
 */
public class BookEx {

	public static void main(String[] args) {

		Book littlePrincs = new Book("어린왕자", "생택쥐페리");
		Book chunHyang = new Book("춘향전");

		littlePrincs.printBookInformaition();
		chunHyang.printBookInformaition();

		littlePrincs.title = "2021년 어린왕자";// 특히 다른 클래스 필드를 함께 사용하지 않음
		littlePrincs.printBookInformaition();

	}

}
