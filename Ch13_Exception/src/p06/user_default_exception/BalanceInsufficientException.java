package p06.user_default_exception;

/*
 Exception의 자식 클래스로 user defined Exception 선언 가능
 
 */
public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {

	}

	public BalanceInsufficientException(String message) {
		super(message);	// 부모 클래스인 Exception 클래스 생성자
	}
}
