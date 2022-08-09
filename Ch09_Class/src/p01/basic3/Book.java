package p01.basic3;

/*
 * 클래스의 초기값은 주로 생성자(컨스트럭터)를 사용함
 * - 필드를 직접 초기화 할 수도 있지만, 신중하게 고려해야함.
 * 
 * 클래스 내에서 선언된 필드들은 컨스트럭터나 메소드에서 직접 사용 가능
 * - new를 사용하여 인스턴스를 만들어 사용할 필요는 없음
 * 
 */
public class Book {
	String title;
	String author;

	public Book(String t) {
		title = t;
		author = "작가미상";
	}

	public Book(String t, String a) {
		title = t;
		author = a;
	}

	public void printBookInformaition() {
		System.out.println("작가 : " + author + "제목: " + title);
	}

}
