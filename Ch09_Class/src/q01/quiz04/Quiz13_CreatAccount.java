package q01.quiz04;

import java.util.Scanner;

import p06.method_parameter_object_array.Circle;

public class Quiz13_CreatAccount {
	static Scanner in = new Scanner(System.in);

	
	private static void creatAccount() {
		
		Quiz13_Account[] accontArray = new Quiz13_Account[100];
		
		System.out.println("【 계좌생성 실행 】");
		
		System.out.print("계좌번호\t: ");
		String account = in.nextLine();
		System.out.print("계좌주\t: ");
		String owner = in.nextLine();
		System.out.print("초기금액\t: ");
		double balance = in.nextDouble();
		
		for (int i = 0; ; i++) {
			accontArray[i] = new Quiz13_Account(account, owner, balance) ;	
		}
		
		
	}
}
