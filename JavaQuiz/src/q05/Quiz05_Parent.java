package q05;

public class Quiz05_Parent {
	public String nation;
	
	public Quiz05_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Quiz05_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	
}
