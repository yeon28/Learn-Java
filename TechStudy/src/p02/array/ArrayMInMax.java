package p02.array;

public class ArrayMInMax {
	static int max;
	static int min;

	public static void Min_Max(int[] arr) {
		max = arr[0];
		min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 4, 1 };
		Min_Max(arr);
		System.out.println("원소 최대 값 : " + max);
		System.out.println("원소 최솟 값 : " + min);

	}

}
