package Quiz2;

/*
2. Person 자식 class 만들기
Person, Student, Employee, Faculty, Staff class 만들기

▪ 최상위부모 (Person), Student, Employee (Person 자식), Faculty, Staff (Employee 자식)

▪ TestPerson class
• Person, Student, Employee, Faculty, Staff class의 인스턴스 만들기
• toString() 및 다른 메소드 호출하여 결과 출력
*/
public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person("하나", "서울", "01012345678", "abc@gmail.com");
		System.out.println("[Person] " + p.toString());
		
		Student stu = new Student("둘", "서울", "01087456321", "asdf@gmail.com", 4);
		System.out.println("[Student] " + stu.toString());
		
		Employee Emp = new Employee("셋", "경기", "01084512637", "a13213f@gmail.com", 123, 40000000);
		System.out.println("[Employee] " + Emp.toString());
		
		Faculty fac = new Faculty("셋", "경기", "01084512637", "a13213f@gmail.com", 123, 40000000, "8", "대리");
		System.out.println("[Faculty] " + fac.toString());
		
		Staff staff = new Staff("셋", "경기", "01084512637", "a13213f@gmail.com", 123, 40000000, "..?");
		System.out.println("[Staff] " + staff.toString());
		
	}

}
