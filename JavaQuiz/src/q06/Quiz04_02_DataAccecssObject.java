package q06;

public class Quiz04_02_DataAccecssObject {
	private String dbName;

	public Quiz04_02_DataAccecssObject() {}

	public Quiz04_02_DataAccecssObject(String dbName) {
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
