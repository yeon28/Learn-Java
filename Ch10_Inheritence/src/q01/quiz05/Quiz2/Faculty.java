package q01.quiz05.Quiz2;

/*
2. Person 자식 class 만들기
Person, Student, Employee, Faculty, Staff class 만들기

▪ 최상위부모 (Person), Student, Employee (Person 자식), Faculty, Staff (Employee 자식)

▪ Faculty class
• fields : officeHours, rank (private String)
• constructor :
- public Faculty(String name, String address, String phone, String email, int office,
double salary, String officeHours, String rank)
• methods : 모든 fields getter/setter method, public String toString()
*/
public class Faculty extends Employee {

	private String officeHours;
	private String rank;

	public Faculty() {
	}

	public Faculty(String name, String address, String phone, String email, int office, double salary,
			String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

//	------------------------------------gettet setter
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

//	--------------------------------------
	@Override
	public String toString() {
		return super.toString() + ", OfficeHours: " + officeHours + ", Rank: " + rank;
	}

}
