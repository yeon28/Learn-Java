package q08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Quiz07_SchoolManageMent {
	
	static ArrayList<Quiz07_Person> mems = new ArrayList<>();

	public void printInfo() {
		Iterator<Quiz07_Person> it = mems.iterator();
		while (it.hasNext()) {
			it.next().sayInfo();
		}
	}

	public void printRandomInfo() {
		Random random = new Random();
		int randomNum = random.nextInt(mems.size());
		System.out.println(randomNum+ "번째 인원정보 출력합니다.");
		mems.get(randomNum).sayInfo();;
	}
}
