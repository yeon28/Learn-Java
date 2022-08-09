package p02.array;

public class FindCommonElements {

	public static void main(String[] args) {
		int[] arr1 = { 112, 3, 4, 5, 253, 23412, 3, 43, 523 };
		int[] arr2 = { 112, 3, 4, 5, 253, 1, 2, 9, 8, 523 };
		

		System.out.print("공통된 원소값은 ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					
					System.out.print(arr1[i] +" ");
				}
			}
		}
		System.out.print("입니다.");

	}

}
