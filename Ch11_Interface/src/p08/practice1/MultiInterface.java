package p08.practice1;

public class MultiInterface {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp.printLogo();
		sp.sendCall();
		sp.paly();
		System.out.println("3+5="+sp.calculate(3, 5));
		sp.schedule();
		sp.receiveSMS();
		sp.stop();
		
	}
}
