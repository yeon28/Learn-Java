package p01.basic;

// 비정방형 배열
public class TwoDimArrayBasic4 {

	public static void main(String[] args) {

		int[][] num;
		num = new int[4][]; 
		// 첫번째 행만 갯수 입력, 열은 미기입. 
		// 열만 기입하기는 불가능.
		
		num[0] = new int[1]; // 1행은 2열
		num[1] = new int[2]; // 2행은 3열
		num[2] = new int[3]; // 3행은 4열
		num[3] = new int[4]; // 4행은 5열
		
		
	}

}
