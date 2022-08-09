package p02.enumtype;

/*
 * 프로그래밍을 할 때 상수를 사용하는 경우가 항상 존재함
 * 1. 직급(사원 대리 과장 차장 부장 주임)
 * 2. 고객 등급(vvip vip ...) 
 * 파이널 등을 사용해서 상수를 사용할 때의 문제점은
 *  -->  여러명이 한 프로젝츠를 수행하면서 상수를 공유할 때, 모든 사람이 강제적으로 상수를 사용하도록 하기가 어려움.
 *  --> 해결방안 : enum type(열거타입)을 통해 모든 사람이 상수를 강제적으로 사용하도록 만듦.
 */
public class EnumTypeBasic {

	public static void main(String[] args) {
		// 자바에서 상수 사용
		final double PI = 3.14;
		final String[] jikkeup = {"사원","주임","대리","과장","차장","부장"};
		
		
	}

}
