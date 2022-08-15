package p01.basic;

public class InheritEx {

	public static void main(String[] args) {

		Person p = new Person();
		p.name = "아담";
		
		p.speak();
		p.eat();
		p.walk();
		p.seelp();
		
		Student s = new Student();
		s.name = "홍길동학생";
		s.age = 30;
		
		s.speak();
		s.eat();
		s.walk();
		s.seelp();
		
		
		Resaercher r = new Resaercher();
		r.name = "";
		
	}

}
