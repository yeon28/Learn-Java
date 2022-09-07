package q08;

public class Quiz06_VariableKind {
	// 인스턴스 멤버 변수
	int memVar;
	// static 멤버 변수
	static int staticVar;

	public static void main(String[] args) {
		// 로컬 변수
		int localVar;

		Quiz06_VariableKind vk1 = new Quiz06_VariableKind();
		System.out.println("vk1.memVar = " + vk1.memVar);
		System.out.println("vk1.staticVar = " + vk1.staticVar);
		System.out.println("VariableKind.staticVar = " + Quiz06_VariableKind.staticVar);
		System.out.println("staticVar = " + staticVar);
		Quiz06_VariableKind vk2 = new Quiz06_VariableKind();
		vk1.staticVar = 20;
		System.out.println("vk2.staticVar = " + vk2.staticVar);
		// System.out.println("localVar = " + localVar);
	}

}
