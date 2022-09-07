package q08;

public class Quiz09_ExceptionTest7 extends Exception {
	//프로그램을 실행할때 입력한 인자의 개수를 저장할 변수 선언
	private int argsNumber;
	public int getArgsNumber() {
		return argsNumber;
	}
	
	public Quiz09_ExceptionTest7() {}
	
	String a;
	public Quiz09_ExceptionTest7(String a) {
		this.a = a;
	}

	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}

	public static void main(String[] args) {
		try { //인자가 2개 입력 되지 않으면 ArgsException 객체를 생성하여 발생
			if(args.length != 2) {
				Quiz09_ExceptionTest7 ae = new Quiz09_ExceptionTest7("인자를 두 개 입력해야 합니다.");
				ae.setArgsNumber(args.length);
				throw ae;
			}
			else {//인자가 2개 정상인 경우 합을 구해서 출력
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			}
		}
		catch(Quiz09_ExceptionTest7 a) { //getMessage() : 해당 예외객체의 메시지를 리턴
			System.out.println("인자를 두 개 입력해야 합니다.");
			System.out.println("당신이 입력한 인자 수는 " + a.getArgsNumber() + "개 입니다.");
		}
	}

}
