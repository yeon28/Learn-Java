package p08.practice2;

/*
 A instanceof B
 - B에는 class, abstract class, interface 모두 가능
 */
public class TestEdible {

	public static void main(String[] args) {
		// promotion
		Object[] obj = {new Tiger(), new Chicken(), new Orange(), new Apple()};
		
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Edible) {
				Edible e = (Edible) obj[i];			// casting
				System.out.println(e.howToEat()); 	// polymorphism
			}
			
			if (obj[i] instanceof Animal) {
				Animal a = (Animal) obj[i];
				System.out.println(a.sound());
			}
		}
		
	}
}
