package p02.runtime_exception;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

/*
 * ClassCastException - 부모 인스턴스를 자식 인스턴스로 강제 형변환할 때 발생하는 예외
 */
public class ClassCastExceptionEx {

	public static void main(String[] args) {
		
//		Dog dog = new Dog();
//		changeDog(dog);
//		
//		Cat cat = new Cat();
//		changeDog(cat);
//	}	
//	
//	public static void changeDog(Animal animal) {
//		if (animal instanceof Dog) {
//			Dog dog = (Dog) animal;
//			System.out.println("Dog 인스턴스로 강제형변환 됐습니다.");
//		} else {
//			System.out.println("Dog 인스턴스로 변환 불가합니다.");
//		}
//	}
		
		
//		----------------------------------------------------------
		

		try {
			Dog dog = new Dog();
			changeDog(dog);
			System.out.println("Dog 인스턴스로 강제형변환 됐습니다.");

			Cat cat = new Cat();
			changeDog(cat);
			System.out.println("Dog 인스턴스로 강제형변환 됐습니다.");

		} catch (ClassCastException e) {
			System.out.println("Dog 인스턴스로 변환 불가합니다.");
		}
	}

	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
	
	
	
}
