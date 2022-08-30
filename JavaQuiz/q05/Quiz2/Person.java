package Quiz2;

/*
 2. Person 자식 class 만들기
 Person, Student, Employee, Faculty, Staff class 만들기
 
▪ 최상위부모 (Person), Student, Employee (Person 자식), Faculty, Staff (Employee 자식)

▪ Person class
• fields : name, address, phoneNo, email (private String)
• constructor :
	- public Person(), public Person(String name, String address, String phone, String email)
• methods : 모든 fields getter/setter method, public String toString()
 */
public class Person {

	private String name;
	private String address;
	private String phoneNo;
	private String email;

	public Person() {

	}

	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phoneNo = phone;
		this.email = email;
	}

//	--------------------------------------------getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	-----------------------------------------
	@Override
	public String toString() {
		return "Name: "+ name + ", Address:" + address + ", Phone:" + phoneNo + ", E-mail: " + email;
	}

}
