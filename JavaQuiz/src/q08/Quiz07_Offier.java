package q08;

public class Quiz07_Offier extends Quiz07_Person{
	private String job;
	
	public Quiz07_Offier() {}
	public Quiz07_Offier(String name, int age, String address, String job) {
		super(name, age, address);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	@Override
	public void sayInfo() {
		System.out.println(
				"이름:" + super.getName() +
				"  나이:" + super.getAge() +
				"  주소:" + super.getAddress() +
				"  직업:" + this.getJob()
				);
	}
}
