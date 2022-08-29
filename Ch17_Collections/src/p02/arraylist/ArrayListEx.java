package p02.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.println("이름을 입력하세요");
			String name = input.next();
			a.add(name);
		}

		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println("정통 for문 사용 이름 : " + name);
		}
		
		System.out.println();

		for (String name : a) {
			System.out.println("정통 for문 사용 이름 : " + name);
		}
		
		Iterator<String> it = a.iterator();
		while (it.hasNext()) { 
			// it.hasNext()
			// it에서 읽어올 때, 메모리에 요소를 읽음과 동시에 정리함.
			// it에 읽어올 요소가 있으면 true, 없으면 false
			String name = it.next();
			System.out.println("Iterator 사용 이름 : " + name);
		}
	}
}
