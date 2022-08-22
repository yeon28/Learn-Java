package p02.compile_exception;

/*
Compile Exception ó�� ���

- ���α׷� �ҽ� �ڵ� �ȿ� ���������� try-catch�� ���� ����ؾ���.
 */
public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
//		Class cls = Class.forName("java,lang.String");
//		--> error : Unhandled exception type ClassNotFoundException
		
		try {
			// cls : java,lang.String class�� �ʵ�, ����Ʈ����, �޼ҵ� ���� ������ ���� �ִ� �ν��Ͻ�
			// forName �޼ҵ忡�� parameter�� �Ѿ�� Ŭ������ ������ ClassNotFoundException �ν��Ͻ� �߻�
			Class cls = Class.forName("java,lang.String");
			System.out.println("Ŭ������ �����մϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
	}
}
