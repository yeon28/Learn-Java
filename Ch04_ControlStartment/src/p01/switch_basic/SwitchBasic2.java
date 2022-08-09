package p01.switch_basic;

public class SwitchBasic2 {

	public static void main(String[] args) {
		//diceNumber는  1 2 3 4 5 6 중에 하나
		int diceNumber = (int) (Math.random()*6+1);
		
		System.out.println("diceNumber = "+ diceNumber);
		
		switch (diceNumber) {
		case 1: // if (diceNumber == 1)
			System.out.println("주사위 1 나왔습니다.");			
		case 2: //else if (diceNumber == 2)
			System.out.println("주사위 2 나왔습니다.");			
		case 3:// else if (diceNumber == 3)
			System.out.println("주사위 3 나왔습니다.");
//			break;
		case 4:// else if (diceNumber == 4)
			System.out.println("주사위 4 나왔습니다.");			
		case 5:// else if (diceNumber == 5)
			System.out.println("주사위 5 나왔습니다.");		
		default: // else  (diceNumber == 6)
			System.out.println("주사위 6 나왔습니다.");
			break;
		}
		
	}

}
