package q01.quiz04;


/*
 18. Quiz11_Singleton 객체를 싱글톤으로 만들기.
 
 */
public class Quiz11_Singleton {
	
	private static  Quiz11_Singleton singleton = new Quiz11_Singleton();
	
	public static Quiz11_Singleton getInstance() {
		return singleton;
	}
	
	public static void main(String[] args) {
		
		Quiz11_Singleton obj1 = singleton.getInstance();
		Quiz11_Singleton obj2 = singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
