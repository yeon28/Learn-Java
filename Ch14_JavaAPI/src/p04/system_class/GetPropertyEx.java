package p04.system_class;

public class GetPropertyEx {

	public static void main(String[] args) {
	
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("�ü�� : " + osName);			// Windows 10
		System.out.println("����ڸ� : " + userName);			// user2
		System.out.println("����� Ȩ���丮 : " + userHome); 	// C:\Users.user2

	}
	
}
