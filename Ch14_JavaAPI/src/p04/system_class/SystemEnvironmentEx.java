package p04.system_class;

/*
 * System.getenv : pc의 시스템환경(System Environment) 설정에 설정된 시스템 환경변수 값을 가져옴.
 */
public class SystemEnvironmentEx {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : "+ javaHome);
		
		
	}
	
}
