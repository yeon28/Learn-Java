package q06;

public class Quiz02_AppCDInfo extends Quiz02_CDInfo implements Quiz02_Lendable {
	String borrower;
	String checkOutDate;
	byte state;
	
	public Quiz02_AppCDInfo() {
	}
	public Quiz02_AppCDInfo(String title) {
		super(title);
	}	
	
	@Override
	public void checkOut(String borrower, String data) {
			if (state != 0) {
				return;
			}
			
			this.borrower =borrower;
			this.checkOutDate = data;
			this.state = 1;
			
			System.out.println("* "+ title+" CD가 대출되었습니다.");
			System.out.println("대출인 : " + borrower);
			System.out.println("대출일 : " + data+ "\n");
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("* "+ title+" CD가 반납되었습니다.");
		
	}

}
