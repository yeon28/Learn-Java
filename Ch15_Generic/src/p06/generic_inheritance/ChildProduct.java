package p06.generic_inheritance;

/*
자식 generic 클래스는 부모 generic 클래스에서 선언되지 않은 새로운 generic  타입을 추가 가능함.
 */
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	
}
