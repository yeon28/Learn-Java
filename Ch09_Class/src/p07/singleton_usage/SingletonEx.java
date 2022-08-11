package p07.singleton_usage;

import java.sql.Date;
import java.util.Calendar;

public class SingletonEx {

	public static void main(String[] args) {
		
//		Singleton s = new Singleton();
		Singleton s = Singleton.getIntance();
		
		s.printSingletonHello();
		
		Singleton s1 = Singleton.getIntance();
		
		if (s == s1) {
			System.out.println("같은 힙메모리를 갖고 있음. 즉, 같은 싱글톤 인스턴스임.");
		}else {
			System.out.println("다른  힙메모리를 갖고 있음. 즉, 다른  싱글톤 인스턴스임.");
		}
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
//		Date
		
	}

}
