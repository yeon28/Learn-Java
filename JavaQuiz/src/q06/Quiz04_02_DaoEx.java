package q06;

public class Quiz04_02_DaoEx {
	public static void dbWork(Quiz04_02_DataAccecssObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new Quiz04_02_OracleDao());
		dbWork(new Quiz04_02_MySqlDao());
	}

}
