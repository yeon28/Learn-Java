package p06.hybrid_repeat;

public class HybridRpeatEx {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int j = 0;
			while (j < i) {
				System.out.print(j + " "); 	
				//println에서 ln은 line을 의미함. ln이 붙으면 다음줄 넘김.
				j++;
			}
			System.out.println();
		}

	}

}
