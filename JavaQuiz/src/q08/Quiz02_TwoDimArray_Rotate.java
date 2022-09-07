package q08;

public class Quiz02_TwoDimArray_Rotate {

	public static int[][] rotate90deg(int[][] dimArr) {
		int y = dimArr.length;
		int x = dimArr[0].length;

		int[][] arr = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = dimArr[y - 1 - j][i];
			}
		}
		return arr;
	}

	public static void printDimArr(int[][] dimArr) {
		for (int i = 0; i < dimArr.length; i++) {
			for (int j = 0; j < dimArr[i].length; j++) {
				System.out.print(dimArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] dimArr = { // y[4] x[3]
				{ 1, 0, 0 }, // [0]
				{ 1, 1, 1 }, // [1]
				{ 1, 0, 1 }, // [2]
				{ 1, 0, 1 } // [3]
		};

		System.out.println("[출력]\n");
		printDimArr(dimArr);

		System.out.println("\n[90도 회전]");
		int[][] rotatedArr90 = rotate90deg(dimArr);
		printDimArr(rotatedArr90);

		System.out.println("\n[180도 회전]");
		int[][] rotatedArr180 = rotate90deg(rotatedArr90);
		printDimArr(rotatedArr180);

		System.out.println("\n[270도 회전]");
		int[][] rotatedArr270 = rotate90deg(rotatedArr180);
		printDimArr(rotatedArr270);

	}
}
