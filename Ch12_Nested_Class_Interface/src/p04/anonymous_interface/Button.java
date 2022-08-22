package p04.anonymous_interface;

public class Button {
	OnClickListener listener;

	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	interface OnClickListener {
		void onClick(); 
	}

}
