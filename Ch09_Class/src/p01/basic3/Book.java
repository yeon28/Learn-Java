package p01.basic3;

/*
 * Ŭ������ �ʱⰪ�� �ַ� ������(����Ʈ����)�� �����
 * - �ʵ带 ���� �ʱ�ȭ �� ���� ������, �����ϰ� ����ؾ���.
 * 
 * Ŭ���� ������ ����� �ʵ���� ����Ʈ���ͳ� �޼ҵ忡�� ���� ��� ����
 * - new�� ����Ͽ� �ν��Ͻ��� ����� ����� �ʿ�� ����
 * 
 */
public class Book {
	String title;
	String author;

	public Book(String t) {
		title = t;
		author = "�۰��̻�";
	}

	public Book(String t, String a) {
		title = t;
		author = a;
	}

	public void printBookInformaition() {
		System.out.println("�۰� : " + author + "����: " + title);
	}

}
