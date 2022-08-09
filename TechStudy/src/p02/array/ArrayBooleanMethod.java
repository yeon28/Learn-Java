package p02.array;

import java.util.Scanner;

public class ArrayBooleanMethod {
	
	public static boolean ArrCantain(int[] arr, int num) {
		for (int a : arr) {
			if (a == num) {
				return true;
			}	
		}return false;
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("찾는 원소 값");
		
		int num= in.nextInt();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,20,40,60,70,80,90,100};
		
		
		
		System.out.println( "찾는 값" +ArrCantain(arr, num));
		
		
	}

}
