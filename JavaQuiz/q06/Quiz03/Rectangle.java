package Quiz03;

/*
 3. Object class method override하기
 
▪ Rectangle class에 Object class의 euqals, toString 메소드 override 하기

▪ Rectangle class
• fields : width, height (private int)
• constructor :
	- public Rectangle(int width, int height)
• methods :
	- width, height getter/setter method
	- public boolean equals() override 만들기 (width, height 값 모두 같으면 true return)
	- public String toString() override 만들기 : width, height 정보 출력

▪ TestRectangle class
• Rectangle class의 인스턴스 3개 만들어 equals method 테스트 수행
	- 인스턴스 2개(width=3, height=4), 인스턴스 1개(width=3, height=5)
• toString() 호출하여 결과 출력
 */
public class Rectangle {
	private int width;
	private int height;

	public Rectangle() {	}
	
	public Rectangle(int width, int height) {	
		this.width = width;
		this.height = height;
	}
	
//	-------------------------getter setter
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		if (width.equals(height)) {
			return true;
		}
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(3, 4);
		Rectangle r3 = new Rectangle(3, 5);
		
		if (condition) {
			
		}
	}
	
}
