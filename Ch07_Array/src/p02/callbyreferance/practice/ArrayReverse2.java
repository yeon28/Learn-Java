package p02.callbyreferance.practice;

public class ArrayReverse2 {

	public static void main(String[] args) {

		int[] list = { 1, 2, 3, 4, 5 };

		System.out.print("reverse 하기 전 :");

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

		System.out.println();

		// 스택에 있는 list의 값을 new list의 새로운 주소로 변경
		list = reverse(list);

		System.out.print("reverse 하기 후 :");

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

	}

	// return type: array return
	public static int[] reverse(int[] list) {
		int[] newList = new int[list.length];

		for (int i = 0; i < list.length; i++) {
			newList[i] = list[list.length - 1 - i];
		}
		return newList;
	}

}
