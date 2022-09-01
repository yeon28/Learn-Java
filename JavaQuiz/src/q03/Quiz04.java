package q03;

import java.util.Scanner;

/* 04. 문자열 정리하기.
 * 
 *	콘솔에 3개의 나라 이름을 문자열로 읽어서 알파벳 내림차순으로 정렬해 출력하시오
 * 입력 Germany France Swiss인 경우 --> 출력 내용은 Swiss Germany France
 */
public class Quiz04 {

//	public static String Reverse(String arr) {
//
//		char[] charArr = arr.toCharArray();
//
//		for (int i = 0; i < charArr.length; i++) {
//			for (int j = i; j < charArr.length; j++) {
//				if (charArr[i] < charArr[j]) {
//					char temp = charArr[i];
//					charArr[i] = charArr[j];
//					charArr[j] = temp;
//				}
//			}
//		}
//
//		String reversArr = "";
//		for (char result : charArr) {
//			reversArr += result;
//		}
//		return reversArr;
//
//	}
//
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("나라 이름 3개 입력하세요.");
		
		String inputArr = in.nextLine();
		String[] arr = inputArr.split(" ");		
		
//		System.out.println(arr[2]);
		
		String[] result = new String[3];
		
		for (String a : arr) {
			String temp = arr[0];
			arr[0] = arr[2];
			arr[2] =  temp;
			for (int j = 0; j < arr.length; j++) {
				if ((arr[j].compareTo(arr[j+1])<0)) {
					;
				}
			}
			
		}// -25 ~ 25
		//0 = 같음
		// 
		

			


//		if (arr[i].compareTo(arr[i+1]) < 0) {// 음수
//			
//			result += arr[i+1];
//			// 먼저
//		}else if (arr[i].compareTo(arr[i+1]) > 0) { //양수
//			result += arr[i];
			// 나중에
//		}else { // 0
//			// 같음
//		}
//		System.out.println(result);

	}

}
