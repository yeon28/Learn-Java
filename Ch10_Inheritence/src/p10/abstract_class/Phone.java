package p10.abstract_class;

public abstract class Phone {
	public String owner;
	
	public  Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("핸드폰을 켭니다.");
	}
	public void turnOff() {
		System.out.println("핸드폰을 끕니다.");
	}
}
