package p10.arrays_method2;

/*
Arrays.sort(sorting할 array)

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
public class Member implements Comparable<Member> {
	String name;
	
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {
//		int compareValue = name.compareTo(o.name);		//오름차순
//		int compareValue = -name.compareTo(o.name);		//내림차순
		int compareValue = o.name.compareTo(this.name);	//내림차순2
		return compareValue;
	};
}
