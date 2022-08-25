package p10.arrays_method2;

import java.util.Arrays;

/*
 Arrays.sort(sorting할 array)
 - sorting : 정렬
 
 -  sorting할 array의 데이터 타입은 
   - int[] char[] long[] double[] 등의 primitive array는 그대로 사용가능
   - class로 지정된 array(위 예제의 String[] Member[] 같은 array)는 Comparable interface를 implement 해야함.

- A.compareTo(B) 형식일 때, return 값이 양의 정수, 0, 음의 정수 3가지임
  
  - Arrays.sort가 오름차순으로 정렬시키기 
  - A < B 이면, 음수를 return함, Arrays.sort가 A B의 순서를 그대로 유지함.
  - A = B 이면, 0를 return함, Arrays.sort가 A B의 순서를 그대로 유지함.
  - A > B 이면, 양수를 return함, Arrays.sort가 A B의 순서를 B A로 바꿈.
  - 앞뒤에 있는 원소를 비교해 앞에 원소값이 클 때, 둘의 순서를 바꿈. 
  
  - Arrays.sort가 내림차순으로 정렬시키기
  - A < B 이면, 양수를 return함, Arrays.sort가 A B의 순서를 B A로 바꿈.
  - A = B 이면, 0를 return함, Arrays.sort가 A B의 순서를 그대로 유지함.
  - A > B 이면, 음수를 return함, Arrays.sort가 A B의 순서를 그대로 유지함.
  - 앞뒤에 있는 원소를 비교해 앞에 원소값이 작을 때, 둘의 순서를 바꿈.
  
  -->  A.compareTo(B)의 연산 결과가 양수이면 A B 순서를 바꿈.
 */
public class SortEx {

	public static void main(String[] args) {
//		int[] scores = { 99, 94, 44, 97, 98 };
//
//		printScoresInfo(scores);
//
//		System.out.println("----------------------");
//		
//		Arrays.sort(scores);
//
//		printScoresInfo(scores);
//
//		System.out.println("----------------------");
//
//		String[] names = { "홍길동", "박동수", "김민수" };
//		Arrays.sort(names);
//
//		printNamesInfo(names);
//
//		System.out.println("----------------------");

		Member[] members = { new Member("홍길동"), new Member("박동수"), new Member("김민수") };
		Arrays.sort(members);

		printMembersInfo(members);
	}

//	public static void printScoresInfo(int[] scores) {
//		for (int i = 0; i < scores.length; i++) {
//			System.out.print(scores[i] + " ");
//		}
//		System.out.println();
//	}
//
//	public static void printNamesInfo(String[] names) {
//		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i] + " ");
//		}
//		System.out.println();
//	}

	public static void printMembersInfo(Member[] members) {
		for (int i = 0; i < members.length; i++) {
			System.out.print(members[i].name + " ");
		}
		System.out.println();
	}
}
