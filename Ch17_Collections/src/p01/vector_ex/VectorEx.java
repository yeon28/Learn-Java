package p01.vector_ex;

import java.util.List;
import java.util.Vector;


/*
Vector<E> : E는 Element의 데이터 타입을 의미함.

List data type 특징
- 원소를 추가할 때, 기본적으로 맨 마지막 원소 다음에 추가함.
- 원소를 삭제하면, 해당 원소의 자리에 다음자리의 원소가 앞으로 당겨짐.(중간에 비어있는 자리가 없음.)

*/
public class VectorEx {

	public static void main(String[] args) {
		// int[] v와 같은 표현
		Vector<Integer> v = new Vector<Integer>();
//		List<Integer> v = new Vector<Integer>(); // promotion
		
		v.add(5);	// 마지막 원소 다음에 집어 넣음.
		v.add(4);
		v.add(-1);
		
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);	// v.get(i) == v[i]
			System.out.println(n);
		}
		
		System.out.println("-----------------------");
		
		v.add(1, 100); // index 1에 100의 값을 끼어넣기.
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);	// v.get(i) == v[i]
			System.out.println(n);
		}
		
		System.out.println("-----------------------");
		
		System.out.println("전체 원소 갯수 : " + v.size());
		//capacity() : vector가 담을 수 있는 최대 원소 갯수 
		System.out.println("vector 전체 크기 : " + v.capacity());

		
		System.out.println("-----------------------");
		
		for (int i = 0; i < 10; i++) {
			v.add(i+10);
		}
		System.out.println("전체 원소 갯수 : " + v.size());
		System.out.println("vector 전체 크기 : " + v.capacity());
		
		System.out.println("-----------------------");
		
		//collection에서는 향상된 for문 적극 사용 권장함.
		for (int i : v) {
			System.out.println("원소 : "+i);
		}
		
	}
}
