package q05;

/*
2. Person 자식 class 만들기
Person, Student, Employee, Faculty, Staff class 만들기

▪ 최상위부모 (Person), Student, Employee (Person 자식), Faculty, Staff (Employee 자식)

▪ TestPerson class
• Person, Student, Employee, Faculty, Staff class의 인스턴스 만들기
• toString() 및 다른 메소드 호출하여 결과 출력
*/
public class Quiz02_TestPerson {

	public static void main(String[] args) {
		
		Quiz02_Person p = new Quiz02_Person("하나", "서울", "01012345678", "abc@gmail.com");
		System.out.println("[Person] " + p.toString());
		
		Quiz02_Student stu = new Quiz02_Student("둘", "서울", "01087456321", "asdf@gmail.com", 4);
		System.out.println("[Student] " + stu.toString());
		
		Quiz02_Employee Emp = new Quiz02_Employee("셋", "경기", "01084512637", "a13213f@gmail.com", 123, 40000000);
		System.out.println("[Employee] " + Emp.toString());
		
		Quiz02_Faculty fac = new Quiz02_Faculty("셋", "경기", "01084512637", "a13213f@gmail.com", 123, 40000000, "8", "대리");
		System.out.println("[Faculty] " + fac.toString());
		
		Quiz02_Staff staff = new Quiz02_Staff("셋", "경기", "01084512637", "a13213f@gmail.com", 123, 40000000, "..?");
		System.out.println("[Staff] " + staff.toString());
		
	}

}
