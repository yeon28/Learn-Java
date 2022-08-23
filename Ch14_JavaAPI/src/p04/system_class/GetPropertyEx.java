package p04.system_class;

public class GetPropertyEx {

	public static void main(String[] args) {
	
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 : " + osName);			// Windows 10
		System.out.println("사용자명 : " + userName);			// user2
		System.out.println("사용자 홈디렉토리 : " + userHome); 	// C:\Users.user2

	}
	
}
