package q06;

public class Quiz04_06_Member {
	private String id;
	private String name;
	
	public Quiz04_06_Member() {
		this.id = id;
		this.name = name;
	}
	
	public Quiz04_06_Member(String id , String name) {
		this.id = id;
		this.name = name;
		
		toString();
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
}
