package p02.array;

public class ArraySum {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		
		int sum = 0;
		
		for (int i : arr) { // i에 arr의 원소를 각각 넣어준다는 의미.
			sum += i;
		}
		System.out.println("arr 배열 안에 있는 수 모두 더한 값 출력");
		System.out.println("sum(합계) : " + sum);
		
	}

}
