package p06.user_default_exception;

/*
 Exception�� �ڽ� Ŭ������ user defined Exception ���� ����
 
 */
public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {

	}

	public BalanceInsufficientException(String message) {
		super(message);	// �θ� Ŭ������ Exception Ŭ���� ������
	}
}
