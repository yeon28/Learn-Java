package p03.method_override3;

/*
 Override한 method에 access modifier는 큰 범위에서 작은 범위로 갈 수 없음.
  - 부모가 public -> default or private (x)
  - 부모가 default or private -> public (o) 
 */
public class SuperSonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;

	//@Override annotation : 컴파일할 때 override가 됐는지 error 체크
	@Override // 부모에서 fly() 호출
	public void fly() {

		// 기본 : super.fly()를 재사용
		// 자식 class의 override된 메소드에서는 변경 내용만 코딩
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			// override된 부모 메소드를 재사용
			super.fly();
		}
	}
}
