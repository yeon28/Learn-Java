package p04.final_method;

public class Car {
	public int speed = 0;

	public void speedUp() {
		speed++;
	}

	public void speedDown() {
		speed--;
	}

	//method를 final로 선언
	public final void stop() {
		speed = 0;
	}
}
