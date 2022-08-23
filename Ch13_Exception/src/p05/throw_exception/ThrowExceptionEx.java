package p05.throw_exception;

/*
Throw Exception ó�����
- ��Ģ�� exception�� �߻��� �޼ҵ忡�� try-catch�� ����Ͽ� ���� ó���ϴ� ���� ��Ģ��.
- exception�� �߻��� �޼ҵ带 ȣ���ϴ� ���� �޼ҵ忡�� ó���ϵ��� �ϴ� ����� ������.
  - ���� �޼ҵ忡�� throws ClassNotFoundException ���� exception ������ �� ����
  - ���� �޼ҵ忡�� ��� ������ exception�� �ѹ��� ó�� �� ��� �����.
 */
public class ThrowExceptionEx {

	public static void main(String[] args) {
		
		try {
			findClass();
			System.out.println("���� ó����.");
		} catch (ClassNotFoundException e) {
			System.out.println("compile-time Exception �߻�");
		}
		
	}
	
	// method���𹮿��� throws ClassNotFoundException�ǹ̴� 
	// --> �޼ҵ� ���ο��� ClassNotFoundException�� �߻��Ǹ�� �޼ҵ带 ȣ���� �޼ҵ�� Exception�� �ѱ�
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
	
}
