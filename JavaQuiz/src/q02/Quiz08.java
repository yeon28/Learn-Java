package q02;

import java.util.Scanner;

/*
 * 입력된 숫자에 최대값 구하기.
 * 
 * console에서  전체 학생수와 각 학생별 점수를 입력받아 전체 학생 중 최고 점수를 출력하시오.
 * "전체 학생 수를 입력하세요." 출력
 * 반복문 이용 전제 학생 수 만큼 loop를 돌면서 최고 성적값을 구함
 * console에 출력
 * 
 */

public class Quiz08 {

	public static void main(String[] args) {
		
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("전체 학생수를 입력하세요.");
		int totalStu = in.nextInt();
		
		System.out.println("학생들의 점수를 입력하세요.");
		for (int i = 0; i < totalStu; i++) {
			float scoreNums[] =  new float[i];	
			scoreNums[i] = in.nextInt();
			
			for (int j = 0; j < 100; j++) {
				if (scoreNums[i] > scoreNums[j]) {
                    Float tmep = scoreNums[i];
                    scoreNums[i] = scoreNums[j];
                    scoreNums[j] = tmep;
                }
			}
        }
		
		
		System.out.println("전체 학생 수는 " + totalStu);
		System.out.println("전체 학생 중 최고점은 ");

			
			
		}


		
	}


