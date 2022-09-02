package q06;

public class Quiz04_05_LoginEx {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void login(String id, String password) throws Quiz04_05_NotExistIDException, Quiz04_05_WrongPasswordException {
		if (!id.equals("blue")) {
			throw new Quiz04_05_NotExistIDException(id + "는 없는 id 입니다.");
		}
		
		if (!password.equals("12345")) {
			throw new Quiz04_05_WrongPasswordException(password + "는 틀린 password 입니다.");
		}
	}
}
