package q08;

public class Quiz07_Student extends Quiz07_Person {
	private String clsName;
	private String clsInfo;
	
	public Quiz07_Student() {}
	public Quiz07_Student(String name, int age, String address, String clsName) {
		super(name, age, address);
		this.clsName = clsName;
		
	}

	public String getClassName() {
		return clsName;
	}

	public void setClassName(String className) {
		this.clsName = className;
	}

	public String getClassInfo() {
		return clsInfo;
	}

	public void setClassInfo(String classInfo) {
		this.clsInfo = classInfo;
	}
	
	@Override
	public void sayInfo() {
		System.out.println(
				"이름:" + super.getName() +
				"  나이:" + super.getAge() +
				"  주소:" + super.getAddress() +
				"  수강과목:" + this.getClassName() 
				);
	}
}
