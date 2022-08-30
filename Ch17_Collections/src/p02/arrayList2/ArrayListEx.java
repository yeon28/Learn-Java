package p02.arrayList2;

import java.util.ArrayList;
import java.util.List;

/*
List 계열 collection 특징
- 원소 값이 동일 하더라도 중복 저장함.
  - 삭제할 때, 튀에 있는 원소가 자동으로 삭제된 원소위치로 이동함.
  - index로 삭제할 원소가 없을 경우, Exception 발생함.
  - 원소 값으로 삭제할 원소가 없으면, Exception 발생 없이 아무런 동작하지 않음.
 */
public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		list.add("Java");
		list.add("jdbc");

		System.out.println("전체갯수 : " + list.size());

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println();

		list.remove(2); // index 2인 "Database" 삭제, index 2는 "Servlet/JSP"
		list.remove(2);	// index 2인 "Servlet/JSP" 삭제, index 2는 "iBatis"
		list.remove("iBatis"); // "iBatis" 원소 삭제 후, null 없이 뒤 원소 index-1함.

		for (String s : list) {
			System.out.println(s);
		}
	}

}
