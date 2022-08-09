package p01.practice;

// 학생 성적 매기기 (문제수 : 10문제)
public class GradeExam {

	public static void main(String[] args) {

		char[][] stuAnser = { 
					{ 'A', 'B', 'C', 'D', 'E', 'E', 'A', 'D' , 'A', 'D'}, 
					{ 'D', 'D', 'A', 'E', 'A', 'E', 'A', 'D' , 'A', 'D'},
					{ 'B', 'A', 'C', 'A', 'C', 'C', 'A', 'D' , 'A', 'D'}, 
					{ 'C', 'C', 'E', 'C', 'B', 'E', 'A', 'D' , 'A', 'D'},
					{ 'E', 'B', 'C', 'D', 'E', 'A', 'A', 'D' , 'A', 'D'}, 
				};
		
		char[] answers = { 'A', 'B', 'C', 'D', 'E', 'E', 'A', 'D' , 'A', 'D'};

		// 5명 성적 구하기
		for (int i = 0; i < stuAnser.length; i++) {
			int correctCount = 0;
			for (int j = 0; j < stuAnser[i].length; j++) {
				if (stuAnser[i][j] == answers[j]) {
					correctCount++;

				}
			}

			System.out.println("학생의 번호 : " + (i + 1) + "의 정답 갯수 : " + correctCount);
		}
	}

}
