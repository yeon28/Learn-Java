package p01.basic3;

/*
 * �ٸ� Ŭ������ ����� �� �ְ� Ŭ������ �޼ҵ�� ����ϰ�, �ʵ�� ������� �ʴ� ���� ��Ģ
 * - ��, BookŬ������ Ÿ��Ʋ ��� �ʵ带 ���� ����ϴ� �� ��ſ�
 *   ����Ʈ������() �޼ҵ带Ȳ���Ͽ� ���
 */
public class BookEx {

	public static void main(String[] args) {

		Book littlePrincs = new Book("�����", "�������丮");
		Book chunHyang = new Book("������");

		littlePrincs.printBookInformaition();
		chunHyang.printBookInformaition();

		littlePrincs.title = "2021�� �����";// Ư�� �ٸ� Ŭ���� �ʵ带 �Բ� ������� ����
		littlePrincs.printBookInformaition();

	}

}
