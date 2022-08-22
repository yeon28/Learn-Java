package p02.nested_interface;

public class Button {
	OnClickListener listener;

	// promotion(CallLisener나 MessageListener의 자식 인스턴스를 부모 역할을 하는
	// 				OnClickListener 인터페이스로 자동형변환)
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
