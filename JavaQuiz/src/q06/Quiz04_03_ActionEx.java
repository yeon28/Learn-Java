package q06;

public class Quiz04_03_ActionEx {

	public static void main(String[] args) {
		Quiz04_03_Action action = new Quiz04_03_Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};

		action.work();
	}
}
