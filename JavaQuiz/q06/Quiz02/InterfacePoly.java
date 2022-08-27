package Quiz02;


public class InterfacePoly {

	public static void main(String[] args) {
		
//		배열의 다양성 활용
		Lendable[] arr = new Lendable[3];
		
		arr[0] = new SeperateVolume("푸코의 진자");
		arr[1] = new SeperateVolume("서양 미술사");
		arr[2] = new AppCDInfo("푸코의 진자");
		
		//배열을 파라미터로 넘겨줌.
		checkOutAll(arr,"김내리","2014709"); 
		
	}
	public static void checkOutAll(Lendable[] arr, String borrower, String checkOutDate ) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].checkOut(borrower, checkOutDate);
		}
	}
	
}
