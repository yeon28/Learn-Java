package p02.array;

public class ArrayFindIndex {
	public static int FindIndex(int[] findArr, int num) {
		if (findArr == null) { // 배열의 원소가 아무것도 없는 경우
			return -1;// -1번쩨 원소는 없음
		}
		for (int i = 0; i < findArr.length; i++) {
			if (findArr[i] == num) {
			return i+1;
			}
			
		}return -1;// -1번쩨 원소는 없음
	}

	public static void main(String[] args) {

		int[] arr = { 123, 3, 4, 2, 342, 3234, 22, 4, 5, 32, 23, 342, 34, 234 };
		int result = FindIndex(arr, 22);
		
		System.out.println("arr에서 22는 "+result+ "번째에 있음." );
	}

}
