package p05.throw_exception;

/*
main method���� Throw Exception�� ����� ���
- jvm�� ���ο��� �ѱ�Exception�� ������
  - user friendly ���� �ʾƼ� ��õ���� ����.
- ���� ���� �޼ҵ忡�� throws ������� �� ��. 
 */
public class ThrowExceptionEx2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
			findClass();
			System.out.println("���� ó����.");
		
	}
	
	// method���𹮿��� throws ClassNotFoundException�ǹ̴� 
	// --> �޼ҵ� ���ο��� ClassNotFoundException�� �߻��Ǹ�� �޼ҵ带 ȣ���� �޼ҵ�� Exception�� �ѱ�
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
	
}
