package p02.array;

import java.util.Scanner;

public class InputArray {
	
	public static int[] ArrayElemets() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("원소 개수");		
		int len = in.nextInt();
		
		System.out.println("원소 입력");
		int[] inputArray = new int[len];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = in.nextInt();
		}
		
		return inputArray;

	}

}
