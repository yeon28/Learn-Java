package p02.superclass_constructor4;

public class Peopel {
	public String name;
	public String ssn;
	
	public Peopel() {
		System.out.println("parent class - default constructor");
	}
	public void people(String name,String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
