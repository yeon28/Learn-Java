package q01.quiz04;

import java.util.Scanner;

public class Quiz13_BankApplication {

	private static Quiz13_Account[] accontArray = new Quiz13_Account[100];
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		System.out.println(" 【 BankApplication 】 ");
		while (run) {
			System.out.println("‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧");
			System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금   | 4.출금   | 5.종료   ");
			System.out.println("‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧");
			System.out.print(" 선택 » ");

			int selectNum = in.nextInt();

			switch (selectNum) {
			case 1:
				creatAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				System.out.println("시스템을 종료합니다.");
				break;
			default:
				System.out.println("없는 번호입니다, 다시 입력하세요.");
				break;
			}

		}

	}

	// 1.계좌생성
	private static void creatAccount() {

		System.out.println("\n【 계좌생성 실행 】");

		System.out.print("계좌번호\t: ");
		String ano = in.next();

		System.out.print("계좌주\t: ");
		String owner = in.next();

		System.out.print("초기금액\t: ");
		double balance = in.nextDouble();

		for (int i = 0; i < accontArray.length; i++) {
			if (accontArray[i] != null) {
				continue;
			} else {
				accontArray[i] = new Quiz13_Account(ano, owner, balance);
				System.out.println("결과 » 계좌가 생성되었습니다.\n\n");
				break;
			}
		}

	}

	// 2.계좌목록
	private static void accountList() {
		System.out.println("\n【 계좌목록 실행 】");

		System.out.println("‧‧‧‧‧‧‧‧");
		System.out.println(" 계좌목록 ");
		System.out.println("‧‧‧‧‧‧‧‧");

		System.out.println("계좌번호\t\t계좌주\t\t초기입금액");

		for (int i = 0; i < accontArray.length; i++) {
			if (accontArray[i] != null) {
				System.out.println(accontArray[i].getAccount() + "\t\t" + accontArray[i].getOwner() + "\t\t"
						+ accontArray[i].getBalance()+"\n\n");
			} else {
				break;
			}
		}
	}

	// 3.예금
	private static void deposit() {
		System.out.println("\n【 예금 실행 】");
		
		System.out.println("‧‧‧‧‧‧‧");
		System.out.println("  예금  ");
		System.out.println("‧‧‧‧‧‧‧");
		
		System.out.print("계좌번호\t: ");
		String ano = in.next();
		
		findAccount(ano);
		
				System.out.println("예금주\t: "+accontArray[i].getOwner());
				System.out.println("잔고\t: "+accontArray[i].getBalance());
				System.out.println(" » 예금할 금액을 입력해 주세요.");
				System.out.print(" 예금 금액 » ");
				
				double deposit = in.nextDouble();
				accontArray[i].setDeposit(deposit);
				
				System.out.print(" 예금 결과 » ");
				System.out.println("계좌번호\t: "+accontArray[i].getAccount());
				System.out.println("\t\t예금주\t: "+accontArray[i].getOwner());
				System.out.println("\t\t잔고\t: "+accontArray[i].getBalance());
				System.out.println("\t » 예금이 완료 되었습니다.\n\n");
			
		
		
	}

	// 4.출금
	private static void withdraw() {
		System.out.println("\n【 출금 실행 】");
		
		System.out.println("‧‧‧‧‧‧‧");
		System.out.println("  출금  ");
		System.out.println("‧‧‧‧‧‧‧");
		
		System.out.print("계좌번호\t: ");
		String ano = in.next();
		
		for (int i = 0; i < accontArray.length; i++) {
			if (accontArray[i].isAccount(ano)) {
				System.out.println("예금주\t: "+accontArray[i].getOwner());
				System.out.println("잔고\t: "+accontArray[i].getBalance());
				System.out.println(" » 출금할 금액을 입력해 주세요.");
				System.out.print(" 출금 금액 » ");
				
				double withdraw = in.nextDouble();
				accontArray[i].setDeposit(withdraw);
				
				System.out.print(" 출금 결과 » ");
				System.out.println("계좌번호\t: "+accontArray[i].getAccount());
				System.out.println("\t\t예금주\t: "+accontArray[i].getOwner());
				System.out.println("\t\t잔고\t: "+accontArray[i].getBalance());
				System.out.println("\t » 출금이 완료 되었습니다.\n\n");
				break;
			} else {
				System.out.println("결과 » 입력된 계좌번호가 없습니다.\n\n");
				break;
			}
		}
	}
	
	private static Quiz13_Account findAccount(String ano) {
		for (int i = 0; i < accontArray.length; i++) {
			if (ano == accontArray[i].getAccount()) {
				boolean a = true;
				
			}
		}
		
	}

}
