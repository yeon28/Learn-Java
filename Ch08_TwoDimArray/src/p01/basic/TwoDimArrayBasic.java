package p01.basic;

public class TwoDimArrayBasic {

	public static void main(String[] args) {

		String[][] gPerson = { 
								{ "1", "박철호", "서울", "회사원" }, 
								{ "2", "김의실", "경기", "공무원" }, 
								{ "3", "오수철", "수원", "연예인" }, 
								{ "4", "김땡땡", "몰라" }, 
					};

		String[] onePerson = new String[4]; //onePerson 선언
		onePerson = gPerson[2]; // gPerson 안에 있는 배열들은 onePerson으로
		for (int i = 0; i < onePerson.length; i++) {//onePerson.length = 3
			System.out.println("onePerson[" + i + "] :" + onePerson[i]);
		}
		
		System.out.println("---------------------------------------");

		for (int i = 0; i < gPerson.length; i++) { //gPerson.length = 4
			for (int j = 0; j < gPerson[i].length; j++) {
				System.out.println("gPerson[" + i + "][" + j + "] : " + gPerson[i][j]);
			}
		}
		
		System.out.println("---------------------------------------");
		
		System.out.println("gPerson[0][0] : " + gPerson[0][0]);
		System.out.println("gPerson[0][1] : " + gPerson[0][1]);
		System.out.println("gPerson[0][2] : " + gPerson[0][2]);
		System.out.println("gPerson[0][3] : " + gPerson[0][3]);
		
		System.out.println("gPerson[1][0] : " + gPerson[1][0]);
		System.out.println("gPerson[1][1] : " + gPerson[1][1]);
		System.out.println("gPerson[1][2] : " + gPerson[1][2]);
		System.out.println("gPerson[1][3] : " + gPerson[1][3]);
		
		System.out.println("gPerson[2][0] : " + gPerson[2][0]);
		System.out.println("gPerson[2][1] : " + gPerson[2][1]);
		System.out.println("gPerson[2][2] : " + gPerson[2][2]);
		System.out.println("gPerson[2][3] : " + gPerson[2][3]);
	}

}
