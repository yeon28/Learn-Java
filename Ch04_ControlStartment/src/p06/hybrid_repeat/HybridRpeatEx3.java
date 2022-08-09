package p06.hybrid_repeat;

public class HybridRpeatEx3 {

	public static void main(String[] args) {

		int i = 5;

		while (i >= 1) {
			int num = 1;
			//j가 1,5보다 작거나 같으면 실행, j +1 증가 i 감소
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "xxx");
				num *= 2;
			}

			System.out.println();
			i--;
		}

	}

}
