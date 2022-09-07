package q08;

public class Quiz06_VariableArgument {
	// JDK 1.5에서 인자의 개수를 가변적으로 받을 수 있는 방식이 추가됨.
	// 가변적으로 넘어온 인자들은 배열 타입으로 받아진다.
	void printInfo(String...infos) {
		if (infos.length != 0) {
			for (int i = 0; i < infos.length; i++) {
				System.out.println(infos[i]);
			}
		} else {
			System.out.println("인자가 없네요.");
		}
	}

	public static void main(String[] args) {
		
		Quiz06_VariableArgument vt = new Quiz06_VariableArgument();
		
		System.out.println("인자 없이");
		vt.printInfo();
		
		System.out.println("인자 하나");
		vt.printInfo("홍길동");
		
		System.out.println("인자 두 개");
		vt.printInfo("홍길동", "직업능력개발");
		
		System.out.println("인자 세 개");
		vt.printInfo("홍길동", "직업능력개발", "1억");
	}

}
