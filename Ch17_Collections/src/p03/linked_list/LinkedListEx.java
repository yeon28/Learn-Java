package p03.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
ArrayList와 LinkedList 속도 

- LinkedList는 원소가 빈번히 추가 삭제되는 appilcaction에 사용하는 것을 권장함.
  - 증권주식주문 같은 어플
- ArrayList는 원소가 빈번히 추가 삭제되면 속도가 느려지는 단점이 있음.
  - 원소 생성 후 조회가 많은 application에서 사용하는 것을 권장함.
  - 박물관시스템, 고고학시스템 같은 경우
  - vector보다는 ArrayList가 처리속도가 일반적으로 더 빨라 ArrayList를 사용.
 */
public class LinkedListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime) + " ns");
	}
	// 결과 : ArrayList보다 LinkedList가 더 빠름.
	
}
