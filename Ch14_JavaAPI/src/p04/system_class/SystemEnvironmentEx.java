package p04.system_class;

/*
 * System.getenv : pc�� �ý���ȯ��(System Environment) ������ ������ �ý��� ȯ�溯�� ���� ������.
 */
public class SystemEnvironmentEx {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : "+ javaHome);
		
		
	}
	
}
