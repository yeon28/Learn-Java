package Quiz2;
/*
2. Person 자식 class 만들기
Person, Student, Employee, Faculty, Staff class 만들기

▪ 최상위부모 (Person), Student, Employee (Person 자식), Faculty, Staff (Employee 자식)

▪ Student class
• fields : status (private int 상수)
	- 상수 : FRESHMAN = 1, SOPHOMORE = 2, JUNIOR= 3, SENIOR=4)
• constructor :
	- public Student(String name, String address, String phone, String email, int status)
• methods : status field getter/setter method, public String toString()
*/

import javax.lang.model.type.PrimitiveType;

public class Student extends Person {

	private int status;
	
	static final int FRESHMAN = 1;
	static final int SOPHOMORE = 2;
	static final int JUNIOR= 3;
	static final int SENIOR=4;
	
	public Student() {
		
	}
	
	public Student(String name, String address, String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

//	---------------------------------------getter setter
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
//	--------------------------------------------
	@Override
	public String toString() {
		return super.toString()+ ", Status: "+ status;
	}
	
	
}
