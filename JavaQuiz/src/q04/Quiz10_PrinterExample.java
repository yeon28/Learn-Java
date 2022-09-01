package q04;

/*
 16. PrinterExample class에서 println()메소드 선언하기.
 17. PrinterExample class에서 메소드를 호출해서 콘솔에 출력하기.
 	int, boolean, double, String type 콘솔에 출력하기. 
 */

public class Quiz10_PrinterExample {

	public void println(int a){
		System.out.println(a);
	}
	public void println(boolean a){
		System.out.println(a);
	}
	public void println(double a){
		System.out.println(a);
	}
	public void println(String a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Quiz10_PrinterExample printer = new Quiz10_PrinterExample();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}

}
