package Quiz2;

/*
2. Person 자식 class 만들기
Person, Student, Employee, Faculty, Staff class 만들기

▪ 최상위부모 (Person), Student, Employee (Person 자식), Faculty, Staff (Employee 자식)

▪ Employee class
• fields : office (private int), salary(private double)
• constructor :
	- public Employee(String name, String address, String phone, String email, int office, double salary)
• methods : office/salary field getter/setter method, public String toString()
*/
public class Employee extends Person {

	private int office;
	private double salary;

	public Employee() {
	}

	public Employee(String name, String address, String phone, String email, int office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
	}

//	----------------------------------------gettet setter
	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	---------------------------------------
	@Override
	public String toString() {
		return super.toString()+", Office: "+ office + ", Salary:" + salary;
	}

}
