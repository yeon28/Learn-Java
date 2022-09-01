package q05;

public class Quiz05_Child extends Quiz05_Parent {
	private String name;
	
	public Quiz05_Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Quiz05_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
}
