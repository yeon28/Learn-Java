package p01.basic;

/*
 * 
 */
public class ArrayBasic {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };

		System.out.println("arr 첫번째 원소 : " + arr[0]);
		System.out.println("arr 첫번째 원소 : " + arr[1]);
		System.out.println("arr 첫번째 원소 : " + arr[2]);
		System.out.println("arr 첫번째 원소 : " + arr[3]);
		System.out.println("arr 전체 배열 원소 갯수 : " + arr.length);

		// ---------------------------------------

		int[] arr1 = { 50, 60, 70, 80 };

		System.out.println("arr1 첫번째 원소 : " + arr1[0]);
		System.out.println("arr1 첫번째 원소 : " + arr1[1]);
		System.out.println("arr1 첫번째 원소 : " + arr1[2]);
		System.out.println("arr1 첫번째 원소 : " + arr1[3]);
		System.out.println("arr1 전체 배열 원소 갯수 : " + arr1.length);

		// ---------------------------------------

		double[] arr2 = { 1.2, 2, 3, 4 };

		System.out.println("arr2 첫번째 원소 : " + arr2[0]);
		System.out.println("arr2 첫번째 원소 : " + arr2[1]);
		System.out.println("arr2 첫번째 원소 : " + arr2[2]);
		System.out.println("arr2 첫번째 원소 : " + arr2[3]);
		System.out.println("arr2 전체 배열 원소 갯수 : " + arr2.length);

		// -----------------------------------------------

		// 2.배열만 선언하고 나중에 초기값을 넣는 방법.
		int arr3[];
		// new + data type(배열 타입인 경우는 예를 들면 int[])
		arr3 = new int[] { 5, 6, 7, 8, 9 };

		System.out.println("arr3 첫번째 원소 : " + arr3[2]);
		System.out.println("arr3 첫번째 원소 : " + arr3[0]);
		System.out.println("arr3 첫번째 원소 : " + arr3[1]);
		System.out.println("arr3 첫번째 원소 : " + arr3[3]);
		System.out.println("arr3 첫번째 원소 : " + arr3[4]);
		System.out.println("arr3 전체 배열 원소 갯수 : " + arr3.length);

//		ArrayBasic ab = new ArrayBasic();

		// ---------------------------------------------------------

		// 3. 배열 원소의 값이 없는 배열 크기만 생성
		int[] arr4 = new int[4];
		arr4[0] = 10;
		arr4[1] = 20;
		arr4[2] = 30;
		arr4[3] = 40;
		System.out.println("arr4의 전체 원소 개수 : " + arr4.length);

		int[] intarray;
		
		//intarray[4]=9; // intarray는 변수만 선언했기 때문에 몇번째에 원소 넣기 -->오류
		intarray = new int[2];
		// ArrayIndexOutOfBoundsException 오류--> 범위가 넘어서 원소를 넣을 수 없음.
		intarray[4] = 9; 
		
		intarray = new int[10];
		intarray[4] = 9;
		
		//length cannot be assigned --> 수정 불가
//		intarray.length =20; 
	}

}
