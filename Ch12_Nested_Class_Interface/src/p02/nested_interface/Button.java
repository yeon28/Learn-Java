package p02.nested_interface;

public class Button {
	OnClickListener listener;

	// promotion(CallLisener�� MessageListener�� �ڽ� �ν��Ͻ��� �θ� ������ �ϴ�
	// 				OnClickListener �������̽��� �ڵ�����ȯ)
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	interface OnClickListener {
		void onClick(); // abstract method
	}

}
