package p02.object_class_tostring2;

/*
 * toString �޼ҵ� ��� ����
 * - Ŭ������ ���� �ν��Ͻ� ����� ����� ��, ���� �ν��Ͻ��� ��� �ʵ� ������ ����� �� �� �����.
 *   - �ʵ尡 private�� ����� ��� public�� getter�޼ҵ带 ���� �ʵ� ������ ���������� �� �� �ִµ���
 *   - toString�� ��� �ʵ� ������ �ѹ��� �� �� ����(println�� ����ϸ� ��.)
 */
public class SmartPhone {

	private String company;
	private String os;
	
	public SmartPhone(String company,  String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		
		return (company +" , "+ os );
	}
	
	
}
