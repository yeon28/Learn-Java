package p04.anonymous_interface;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();

	// �θ��� listener interface type�� �ڽ� �͸�ü�� ����(promotion)
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	public Window() {
		btn1.setListener(listener);
		
		// setListener�� �ڽ� �͸�ü�� �ѱ�(promotion)
		btn2.setListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");
			}
		});
	}
	
}
