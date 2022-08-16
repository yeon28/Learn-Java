package p02.superclass_constructor4;

/*
 모든 클래스의 부모 크래스는 Object class임
 - 모든 클래스를 new로 인스턴스 만들 때, 
 	힙메모리에 인스턴스 생성 전, Object class의 인스턴스가 먼저 생성됨.
 - 부모가 Object class인 경우는 생략 가능(java가 자동으로 힙메모리에 인스턴스 생성함.)
 */
public class Student extends Object {

	public int studentNo;
	public People() {
		System.out.println();
	}
	
	public Student(String name, String ssn, int tudentNo) {
		super();
		this.name = name;
		this.ssn = ssn;
//		this.studentNo= studentNo;
	}
	
}
