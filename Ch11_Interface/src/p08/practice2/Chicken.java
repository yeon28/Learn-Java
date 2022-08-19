package p08.practice2;

public class Chicken extends Animal implements Edible {

	@Override
	public String howToEat() {
		return "Æ¢°Ü¸ÔÁö!";
	}

	@Override
	public String sound() {
		return "²¿²¿´ì";
	}

}
