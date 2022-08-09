package p03.while_basic;

public class WhilBasic2 {

	public static void main(String[] args) {

		int sum=0;
		int num =1;
		
		while (num <=10) {
			sum += num; // sum = sum + num; 
			num++; 		// --> sum =0+1+2+3+,,+10
		}
		
		System.out.println("1~10까지 합: "+sum);
		
	}

}
