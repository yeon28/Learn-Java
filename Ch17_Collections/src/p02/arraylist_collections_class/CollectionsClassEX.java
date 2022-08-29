package p02.arraylist_collections_class;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Collections method 설명
- max() 최대값, min() 최소값
- binarySearch() 원하는 원소의 찾아 index 리턴함.
  - binary search 알고리즘을 사용하여 검색함, 속도가 매우 빠름.
- sort() 오름차순, reverse() 리스트 순서 역행
- disjoint() 두개의 리스트를 비교해 중복되지 않으면 true, 중복되면 false
 */
public class CollectionsClassEX {

	public static void main(String[] args) {
		Integer[] numbers = { 1123, 1412, 23, 44, 512132 };
		List<Integer> list = Arrays.asList(numbers);

		System.out.println("Collections.max(list) : " + Collections.max(list));
		System.out.println("Collections.min(list) : " + Collections.min(list));
		System.out.println("Collections.binarySearch(list) : " + Collections.binarySearch(list, 44));

		Collections.sort(list); // 오름차순
		System.out.println("오름차순 : "+list);
		Collections.reverse(list); // 리스트 역행
		System.out.println("리스트 역행 : "+list);

		Integer[] numbers1 = { 1123, 1412, 23, 44, 512132 };
		List<Integer> list1 = Arrays.asList(numbers1);
		Integer[] numbers2 = { 123, 142, 3, 4, 5132 };
		List<Integer> list2 = Arrays.asList(numbers2);

		// 두 리스트의 중복확인
		System.out.println(Collections.disjoint(list, list1)); // 중복 있음, false
		System.out.println(Collections.disjoint(list1, list2)); // 중복 없음, true
	}
}
