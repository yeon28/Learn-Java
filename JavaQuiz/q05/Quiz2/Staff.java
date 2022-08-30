package Quiz2;

/*
2. Person 자식 class 만들기
Person, Student, Employee, Faculty, Staff class 만들기

▪ 최상위부모 (Person), Student, Employee (Person 자식), Faculty, Staff (Employee 자식)

▪ Staff class
• fields : title (private String)
• constructor :
- public Faculty(String name, String address, String phone, String email, int office,
double salary, String title)
• methods : title field getter/setter method, public String toString()
*/
public class Staff extends Employee {

	private String title;

	public Staff() {}

	public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

//	----------------------------------------gettet setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
//	-----------------------------------------
	@Override
	public String toString() {
		return super.toString() + ", Title: " + title;
	}
	
}
