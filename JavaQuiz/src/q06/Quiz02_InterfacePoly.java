package q06;


public class Quiz02_InterfacePoly {

	public static void main(String[] args) {
		
//		배열의 다양성 활용
		Quiz02_Lendable[] arr = new Quiz02_Lendable[3];
		
		arr[0] = new Quiz02_SeperateVolume("푸코의 진자");
		arr[1] = new Quiz02_SeperateVolume("서양 미술사");
		arr[2] = new Quiz02_AppCDInfo("푸코의 진자");
		
		//배열을 파라미터로 넘겨줌.
		checkOutAll(arr,"김내리","2014709"); 
		
	}
	public static void checkOutAll(Quiz02_Lendable[] arr, String borrower, String checkOutDate ) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].checkOut(borrower, checkOutDate);
		}
	}
	
}
