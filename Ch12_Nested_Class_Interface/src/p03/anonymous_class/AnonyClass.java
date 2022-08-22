package p03.anonymous_class;

public class AnonyClass {
	// Person�� �͸� �ڽ� class�� �ν��Ͻ��� �����, �θ�� promotion�� ��Ŵ
	Person person = new Person() {
		void work() {
			System.out.println("��� �մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}

	};

	public AnonyClass() {
		System.out.println("AnonyClass constructor call");
	}

	void method1() {
		// promotion
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};

		localVar.wake();
	}
	
	// promotion �ڽ� �͸� ��ü�� �θ�� �ڵ�����ȯ
	void method2(Person person) {
		person.wake();		// polymorphism
	}

}
