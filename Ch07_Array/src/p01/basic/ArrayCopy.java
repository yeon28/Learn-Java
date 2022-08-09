package p01.basic;

//배열 복사 (A배열 원소들의 값을 전체 B배열 원소들로 값을 복사)
public class ArrayCopy {

	public static void main(String[] args) {

		int[] sourceArr = { 2, 3, 1, 5, 10 };
		int[] targetArr = new int[sourceArr.length];

		// 1. for문을 사용하여 단순 복사 하는 방법
		for (int i = 0; i < sourceArr.length; i++) {
			targetArr[i] = sourceArr[i];
		}

		for (int i = 0; i < targetArr.length; i++) {
			System.out.println("targetArr[" + i + "] = " + targetArr[i]);
		}
		System.out.println("----------------------------------------");

		// 2. System.arraycopy Method 사용하기
		System.arraycopy(sourceArr, 0, targetArr, 0, sourceArr.length);

		for (int i = 0; i < targetArr.length; i++) {
			System.out.println("targetArr[" + i + "] = " + targetArr[i]);
		}
	}

}
