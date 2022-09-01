package Quiz04_06;

public class Member {
	private String id;
	private String name;
	
	public Member() {
		this.id = id;
		this.name = name;
	}
	
	public Member(String id , String name) {
		this.id = id;
		this.name = name;
		
		toString();
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
}
