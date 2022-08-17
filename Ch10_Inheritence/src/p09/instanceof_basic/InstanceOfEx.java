package p09.instanceof_basic;

class Person{}
class Student extends Person{}
class Resercher extends Person{}
class Professor extends Resercher{}

/*
 instanceof 사용 문법
 - A instanceof B 
   - A는 변수이름(인스턴스) B는 클래스 이름
 - 결과: A변수의 힙메모리에 B클래스의 인스턴스가 있으면 true return, 없으면 false return
 */
public class InstanceOfEx {
	public static void main(String[] args) {
		System.out.print("new Person Instance 결과 -> \t");
		printInstanceInfomation(new Person());
		
		System.out.print("new Person Instance 결과 -> \t");
		printInstanceInfomation(new Student());
		
		System.out.print("new Person Instance 결과 -> \t");
		printInstanceInfomation(new Resercher());
		
		System.out.print("new Person Instance 결과 -> \t");
		printInstanceInfomation(new Professor());
	}
	
	// method parameter에서 promotion이 발생함.
	public static void printInstanceInfomation(Person p) {
		if (p instanceof Person) {
			System.out.print("Person instance ");
		}
		if (p instanceof Student) {
			System.out.print("Student instance ");
		}
		if (p instanceof Resercher) {
			System.out.print("Resercher instance ");
		}
		if (p instanceof Professor) {
			System.out.print("Professor instance ");
		}
		System.out.println();
	}
}
