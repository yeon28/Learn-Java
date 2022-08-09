package p04.practice_callbyvalue;

public class TestCallByValue {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;

		System.out.println("main method - swap 전 n1 = " + num1 + ", n2 = " + num2);

		swap(num1, num2);
		System.out.println("main method - swap 후 n1 = " + num1 + ", n2 = " + num2);

	}

	//CallByValue 
	public static void swap(int n1, int n2) {

		System.out.println("swap method - swap 전 n1 = " + n1 + ", n2 = " + n2);

		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println("swap method - swap 후 n1 = " + n1 + ", n2 = " + n2);
	}

}
