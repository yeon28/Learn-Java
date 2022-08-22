package p02.nested_interface;

public class ButtonEx {

	public static void main(String[] args) {
		Button button = new Button();
		
		button.setListener(new CallListener());
		button.touch();
		
		button.setListener(new MessageListener());
		button.touch();
	}
}
