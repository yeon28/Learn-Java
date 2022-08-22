package p02.runtime_exception;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

/*
 * ClassCastException - �θ� �ν��Ͻ��� �ڽ� �ν��Ͻ��� ���� ����ȯ�� �� �߻��ϴ� ����
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
//			System.out.println("Dog �ν��Ͻ��� ��������ȯ �ƽ��ϴ�.");
//		} else {
//			System.out.println("Dog �ν��Ͻ��� ��ȯ �Ұ��մϴ�.");
//		}
//	}
		
		
//		----------------------------------------------------------
		

		try {
			Dog dog = new Dog();
			changeDog(dog);
			System.out.println("Dog �ν��Ͻ��� ��������ȯ �ƽ��ϴ�.");

			Cat cat = new Cat();
			changeDog(cat);
			System.out.println("Dog �ν��Ͻ��� ��������ȯ �ƽ��ϴ�.");

		} catch (ClassCastException e) {
			System.out.println("Dog �ν��Ͻ��� ��ȯ �Ұ��մϴ�.");
		}
	}

	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
	
	
	
}
