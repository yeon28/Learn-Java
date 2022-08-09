package p06.hybrid_repeat;

public class HybridRpeatEx2 {
	public static void main(String[] args) {

		int i = 0;

		while (i < 5) {
			// j는 0부터 , 1보다 크면 ,j 출력 후 j에서 -1 증감 ~
			for (int j = i; j > 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println("*********************");
			i++;

		}

	}
}
