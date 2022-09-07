package q08;

import java.util.Scanner;

public class Quiz07_MainEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Quiz07_SchoolManageMent manage = new Quiz07_SchoolManageMent();

		manage.mems.add(new Quiz07_Student("김민태", 21, "서울시", "수학"));
		manage.mems.add(new Quiz07_Student("강종민", 25, "경기시", "국어"));
		manage.mems.add(new Quiz07_Student("강현빈", 23, "구리시", "미술"));
		manage.mems.add(new Quiz07_Student("한순민", 22, "하남시", "영어"));
		manage.mems.add(new Quiz07_Offier("김정태", 40, "서울시", "교사"));
		manage.mems.add(new Quiz07_Offier("김민태", 45, "서울시", "행정직원"));
		manage.mems.add(new Quiz07_Offier("이구민", 48, "서울시", "교장"));
		manage.mems.add(new Quiz07_Offier("노태현", 50, "서울시", "사장"));

		boolean run = true;
		int command = 0;
		
		while (run) {
			System.out.println("\n[[메뉴]]\n1.전체 인원 출력 \n2.랜덤하게 인원 출력 \n3.종료");
			System.out.print("입력>>");
			command = input.nextInt();

			switch (command) {
			case 1:
				manage.printInfo();
				break;
			case 2:
				manage.printRandomInfo();
				break;
			case 3:
				run = false;
				break;
			}

		}
		System.out.println("프로그램 종료");

	}

}
