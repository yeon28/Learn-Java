package Quiz04_02;

public class DataAccecssObject {
	private String dbName;

	public DataAccecssObject() {}

	public DataAccecssObject(String dbName) {
		this.dbName = dbName;
	}
	

	public void select() {
		System.out.println(dbName + " DB에서 검색");
	}

	public void insert() {
		System.out.println(dbName + " DB에 삽입");
	}

	public void update() {
		System.out.println(dbName + " DB를 수정");
	}

	public void delete() {
		System.out.println(dbName + " DB에서 삭제");
	}
}
