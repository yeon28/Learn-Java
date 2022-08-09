package p01.basic;


// 배열의 원소 초기 값을 100이내의 실수 값으로 랜덤하게 주는 프로그램.
public class ArrayBasic7 {

	public static void main(String[] args) {

		double[] myList = new double[10];
		
		for (int i = 0; i < myList.length; i++) { // myList.length = 10
			myList[i] = Math.random()*100;
		}
		
		for (double element : myList) {
			System.out.println(element);
		}
		
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (myList[i]>max) {
				max = myList[i];
			}
		}
		System.out.println("max : " + max);
	}

}
