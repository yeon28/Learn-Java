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
		s.name = "홍길동 학생";
		s.age = 20;

		s.speak();
		s.eat();
		s.walk();
		s.seelp();
		s.study();

		StudentWorker sw = new StudentWorker();
		sw.name = "홍길동 학생";
		sw.age = 20;

		sw.speak();
		sw.eat();
		sw.walk();
		sw.seelp();
		sw.study();
		sw.work();

		Resercher r = new Resercher();
		r.name = "홍길동 연구원	";
		r.age = 30;

		r.speak();
		r.eat();
		r.walk();
		r.seelp();
		r.reserch();

		Professor ps = new Professor();
		ps.name = "홍길동 교수";
		ps.age = 30;

		ps.speak();
		ps.eat();
		ps.walk();
		ps.seelp();
		ps.reserch();
		ps.teach();

	}

}
