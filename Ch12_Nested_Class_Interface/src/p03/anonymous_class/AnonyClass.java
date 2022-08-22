package p03.anonymous_class;

public class AnonyClass {
	// Person의 익명 자식 class에 인스턴스를 만들고, 부모로 promotion을 시킴
	Person person = new Person() {
		void work() {
			System.out.println("출근 합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
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
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}
		};

		localVar.wake();
	}
	
	// promotion 자식 익명 객체를 부모로 자동형변환
	void method2(Person person) {
		person.wake();		// polymorphism
	}

}
